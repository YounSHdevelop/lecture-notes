package cafe.order;

import cafe.menu.Beverage;
import cafe.menu.Donut;
import cafe.menu.MenuItem;
import java.util.ArrayList;

// 주문을 관리하는 클래스
// 주문된 항목을 컬렉션(ArrayList)에 담고, 가격 및 할인 가격 계산
public class Order {
    private int orderId;
    private String userId;
    private ArrayList<MenuItem> items;

    // Order 클래스의 생성자, orderId 주문 고유 번호, userId 주문한 고객의 ID
    public Order(int orderId, String userId) {
        this.orderId = orderId;
        this.userId = userId;
        this.items = new ArrayList<>();
    }

    // 주문에 메뉴 항목을 추가, item 추가할 메뉴 항목
    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    // 할인 적용 전 총 금액을 계산
    public int calculateOriginalPrice() {
        int originalPrice = 0;
        for (MenuItem item : this.items) {
            originalPrice += item.getPrice();
        }
        return originalPrice;
    }

    // 도넛 2개 + 음료 1개 세트 메뉴 할인을 적용
    public int applySetDiscount() {
        int donutCount = 0;
        int beverageCount = 0;
        for (MenuItem item : this.items) {
            if (item instanceof Donut) {
                donutCount++;
            } else if (item instanceof Beverage) {
                beverageCount++;
            }
        }
        int setDiscountCount = Math.min(donutCount / 2, beverageCount / 1);
        return setDiscountCount * 1000;
    }

    // 세트 메뉴 할인이 적용된 최종 금액을 계산
    public int getFinalPriceAfterSetDiscount() {
        return calculateOriginalPrice() - applySetDiscount();
    }

    // 주문 내역을 출력
    public void displayOrderDetails() {
        System.out.println("\n[주문 내역]");
        System.out.print("전체 주문 번호: " + this.orderId);
        System.out.println(", 주문자: " + this.userId);
        for (MenuItem item : this.items) {
            System.out.println("- " + item.getName() + " (" + item.getPrice() + "원)");
        }
    }

    // 주문 항목의 개수를 반환
    public int getOrderSize() {
        return this.items.size();
    }
    
    // 주문한 고객의 ID를 반환
    public String getUserId() {
        return this.userId;
    }
}