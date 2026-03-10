package cafe.system;

import cafe.menu.Beverage;
import cafe.menu.Donut;
import cafe.menu.MenuItem;
import cafe.order.Order;
import cafe.user.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// 전체 카페 시스템의 메인 클래스 - 고객 정보, 메뉴, 주문을 처리
public class CafeSystem {
    private Map<String, Customer> customers;
    private Scanner scanner;
    private ArrayList<MenuItem> menu;
    private int nextOrderId;

    public CafeSystem() {
        this.customers = new HashMap<>();
        this.scanner = new Scanner(System.in);
        this.menu = new ArrayList<>();
        this.nextOrderId = 1;
        initializeMenu();
    }

    // 메뉴 항목들을 초기화
    private void initializeMenu() {
        this.menu.add(new Beverage("커피", 4000));
        this.menu.add(new Beverage("아이스 커피", 4500));
        this.menu.add(new Beverage("망고 주스", 5000));

        this.menu.add(new Donut("기본 도넛", 2000));
        this.menu.add(new Donut("크림 도넛", 2500));
        this.menu.add(new Donut("딸기 도넛", 2500));
        this.menu.add(new Donut("레몬 도넛", 2500));
    }

    // 사용자 입력에 따라 주문 처리를 반복
    public void run() {
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
                System.out.println("> 누적 주문 횟수: " + (currentCustomer.getOrderCount()  + 1) + "회");
            }
            
            this.processOrder(currentCustomer);
        }
        this.scanner.close();
    }

    // 메뉴를 화면에 출력
    private void showMenu() {
        System.out.println("--- 메뉴 ---");
        System.out.println("[음료]");
        for (int i = 0; i < 3; i++) {
            MenuItem item = this.menu.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " (" + item.getPrice() + "원)");
        }
        System.out.println();
        System.out.println("[도넛]");
        for (int i = 3; i < this.menu.size(); i++) {
            MenuItem item = this.menu.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " (" + item.getPrice() + "원)");
        }
        System.out.println();
    }

    // 고객의 주문을 처리하는 메서 - customer 주문을 진행하는 고객 객체
    private void processOrder(Customer customer) {
        Order currentOrder = new Order(this.nextOrderId++, customer.getUserId());
        int choice;

        showMenu();

        while (true) {
            System.out.print("원하는 메뉴 번호를 입력하세요 (0을 입력하면 주문 완료): ");
            try {
                choice = Integer.parseInt(this.scanner.nextLine());
                if (choice == 0) {
                    break;
                }
                if (choice >= 1 && choice <= this.menu.size()) {
                    currentOrder.addItem(this.menu.get(choice - 1));
                    System.out.println(this.menu.get(choice - 1).getName() + "를(을) 장바구니에 담았습니다.");
                } else {
                    System.out.println("잘못된 메뉴 번호입니다. 다시 입력해 주세요.");
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
            
            System.out.println("주문이 완료되었습니다. 감사합니다!\n");
            customer.incrementOrderCount();
        } else {
            System.out.println("주문 항목이 없어 주문을 취소합니다.\n");
        }
    }

    // 5회차 주문 시 50% 할인
    // customer 현재 고객 객체, price 세트 할인 적용 후 금액
    private double calculateLoyaltyDiscount(Customer customer, int price) {
        int customerOrderCount = customer.getOrderCount() + 1;
        if (customerOrderCount % 5 == 0) {
            System.out.println("축하합니다! 5회차 주문으로 50% 할인을 받습니다!");
            return price * 0.5;
        }
        return price;
    }

    public static void main(String[] args) {
        CafeSystem cafe = new CafeSystem();
        cafe.run();
    }
}