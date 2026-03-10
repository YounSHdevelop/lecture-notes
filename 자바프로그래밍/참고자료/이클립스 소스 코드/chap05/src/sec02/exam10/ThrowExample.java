package sec02.exam10;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            order(-1);   
        } catch (Exception e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    // 주문 수량을 확인하고 잘못되면 예외를 던짐
    public static void order(int q) throws Exception {
        if (q <= 0) {
            throw new Exception("주문은 0보다 커야 함.");
        }
        System.out.println("도넛 주문이 완료. 수량: " + q);
    }
}