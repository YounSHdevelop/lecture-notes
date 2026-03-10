package online.store;

import cafe.menu.Beverage;
import cafe.menu.Donut;
import cafe.menu.MenuItem;
import cafe.order.Order;
import cafe.user.Customer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 기존 projectcafe의 클래스들을 재사용하여 온라인 상점 시스템을 구현
public class OnlineStore {
    private Map<String, Customer> customers;
    private Scanner scanner;
    private ArrayList<MenuItem> products;
    private int nextOrderId;

    public OnlineStore() {
        this.customers = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.products = new ArrayList<>();
        this.nextOrderId = 1;
        initializeProducts();
    }

    //기존 cafe 프로젝트의 클래스(Beverage, Donut)를 상품으로 활용
    private void initializeProducts() {
        // 기존 클래스 재사용
        this.products.add(new Beverage("커피", 4000));
        this.products.add(new Beverage("아이스 커피", 4500));
        this.products.add(new Beverage("망고 주스", 5000));
        this.products.add(new Donut("기본 도넛", 2000));
        this.products.add(new Donut("크림 도넛", 2500));
        this.products.add(new Donut("딸기 도넛", 2500));
        this.products.add(new Donut("레몬 도넛", 2500));
        
        // 새로운 상품 카테고리 추가
        this.products.add(new Product("텀블러", 15000));
        this.products.add(new Product("에코백", 10000));
    }

    // 시스템의 메인 루프
    public void run() {
        System.out.println("온라인 상점에 오신 것을 환영합니다!");
        while (true) {
            System.out.print("사용자 이름을 입력하세요 (종료: quit): ");
            String userId = this.scanner.nextLine();
            if (userId.equalsIgnoreCase("quit")) {
                System.out.println("시스템을 종료합니다.");
                break;
            }

            Customer currentCustomer = this.customers.get(userId);
            if (currentCustomer == null) {
                currentCustomer = new Customer(userId);
                this.customers.put(userId, currentCustomer);
                System.out.println("새로운 사용자 " + userId + "님 환영합니다!");
            } else {
                System.out.print("또 오셨네요, " + userId + "님! ");
                System.out.println("> 누적 주문 횟수: " + (currentCustomer.getOrderCount() + 1) + "회");
            }
            this.processOrder(currentCustomer);
        }
        this.scanner.close();
    }

    // 메뉴를 화면에 출력
    private void showProducts() {
        System.out.println("--- 상품 목록 ---");
        for (int i = 0; i < this.products.size(); i++) {
            MenuItem item = this.products.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " (" + item.getPrice() + "원)");
        }
        System.out.println();
    }

    // 고객의 주문을 처리하고 파일에 기록
    private void processOrder(Customer customer) {
        Order currentOrder = new Order(this.nextOrderId++, customer.getUserId());
        int choice;

        showProducts();

        while (true) {
            System.out.print("원하는 상품 번호를 입력하세요 (0을 입력하면 주문 완료): ");
            try {
                choice = Integer.parseInt(this.scanner.nextLine());
                if (choice == 0) {
                    break;
                }
                if (choice >= 1 && choice <= this.products.size()) {
                    currentOrder.addItem(this.products.get(choice - 1));
                    System.out.println(this.products.get(choice - 1).getName() + "를(을) 장바구니에 담았습니다.");
                } else {
                    System.out.println("잘못된 상품 번호입니다. 다시 입력해 주세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 입력입니다. 숫자를 입력해 주세요.");
            }
        }

        if (currentOrder.getOrderSize() > 0) {
            currentOrder.displayOrderDetails();

            int originalPrice = currentOrder.calculateOriginalPrice();
            int setDiscount = currentOrder.applySetDiscount(); 
            int priceAfterSetDiscount = currentOrder.getFinalPriceAfterSetDiscount();
            double finalPrice = this.calculateLoyaltyDiscount(customer, priceAfterSetDiscount);
            int loyaltyDiscount = priceAfterSetDiscount - (int)finalPrice;
            
            System.out.println("\n총 금액: " + originalPrice + "원");
            System.out.println("할인 금액: " + (setDiscount + loyaltyDiscount) + "원 (세트 메뉴 할인: " + setDiscount + "원, 50% 할인: " + loyaltyDiscount + "원)");
            System.out.println("최종 결제 금액: " + (int) finalPrice + "원");
            
            this.saveOrderToFile(currentOrder, (int) finalPrice);
            System.out.println("주문이 완료되었습니다. 감사합니다!\n");
            customer.incrementOrderCount();
        } else {
            System.out.println("주문 항목이 없어 주문을 취소합니다.\n");
        }
    }

    // 5회차 주문 시 50% 할인을 계산합니다.
    private double calculateLoyaltyDiscount(Customer customer, int price) {
        int customerOrderCount = customer.getOrderCount() + 1;
        if (customerOrderCount % 5 == 0) {
            System.out.println("축하합니다! 5회차 구매로 50% 할인을 받습니다!");
            return price * 0.5;
        }
        return price;
    }

    // 주문 내역을 orders.txt 파일에 저장합니다.
    private void saveOrderToFile(Order order, int finalPrice) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("orders.txt", true))) {
            writer.println("--------------------");
            writer.println("주문 번호: " + (this.nextOrderId - 1));
            writer.println("사용자 ID: " + order.getUserId());
            writer.println("결제 금액: " + finalPrice + "원");
            writer.println("주문 시간: " + new java.util.Date());
            writer.println("--------------------");
        } catch (IOException e) {
            System.out.println("주문 내역을 파일에 저장하는 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        store.run();
    }
}

// MenuItem을 구현하여 새로운 상품 카테고리를 정의합니다.
class Product implements MenuItem {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}