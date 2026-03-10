package chap04.lab01;

class OTT {
    String name;   	// OTT 서비스 이름
    int price;     	// 월 회원 가격

    public void show() {
        System.out.println(name + "의 월 이용료는 " + price + "원");
    }
}

public class OTTExample {
    public static void main(String[] args) {
        OTT netflix = new OTT();      // 첫 번째 OTT 객체 생성
        OTT tving = new OTT();        // 두 번째 OTT 객체 생성

        netflix.name = "Netflix";     // 이름 설정
        netflix.price= 13500;         // 가격 설정

        tving.name= "TVING";          // 이름 설정
        tving.price = 7900;           // 가격 설정

        netflix.show();               // 첫 번째 객체의 정보 출력
        tving.show();                 // 두 번째 객체의 정보 출력
    }
}