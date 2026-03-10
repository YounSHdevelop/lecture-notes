package sec01.exam05;

public class GetterSetterExample {
    public static void main(String[] args) {
        Donut d1 = new Donut("스페셜 너트 도넛"); // 생성자를 통해 이름 설정

        d1.setPrice(2000); 			    // 가격 설정

        System.out.println("도넛 이름: " + d1.getName());
        System.out.println("가격: " + d1.getPrice() + "원");

        d1.setPrice(-500);   			    // 유효하지 않은 값 설정 시도
    }
}