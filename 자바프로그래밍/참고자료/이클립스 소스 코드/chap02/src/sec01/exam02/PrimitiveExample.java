package sec01.exam02;

public class PrimitiveExample {
    public static void main(String[] args) {
        String name = "초코";      			// 문자열: 도넛 이름
        char size = 'M';     				// 문자형: 도넛 크기
        int price = 2000;        			// 정수형: 도넛 가격
        double weight = 45.5;      			// 실수형: 도넛 무게 (g)
        boolean isFry = true;    			// 불리언형: 튀김 여부
        
        System.out.println("도넛 이름: " + name + "도넛");
        System.out.println("도넛 크기: " + size);
        System.out.println("도넛 가격: " + price + "원");
        System.out.println("도넛 무게: " + weight + "g");
        System.out.println("튀김 여부: " + isFry);
    }
}