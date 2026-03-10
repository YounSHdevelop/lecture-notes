package cafe.user;

// 고객 정보를 담는 클래스
public class Customer {
    private String userId;
    private int orderCount;

     // Customer 클래스의 생성자, userId 고객의 고유 ID
    public Customer(String userId) {
        this.userId = userId;
        this.orderCount = 0;
    }

    // 고객의 ID를 반환
    public String getUserId() {
        return this.userId;
    }

    // 고객의 누적 주문 횟수를 반환합니다.
    public int getOrderCount() {
        return this.orderCount;
    }

    // 고객의 주문 횟수 1 증가
    public void incrementOrderCount() {
        this.orderCount++;
    }
}