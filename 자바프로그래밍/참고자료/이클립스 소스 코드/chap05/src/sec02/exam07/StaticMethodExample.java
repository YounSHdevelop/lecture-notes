package sec02.exam07;

class DonutInfo {
    static String phoneNumber = "02-123-4567"; 	// 객체 생성 없이 접근 가능

    static void callShop() {			   		// 객체 생성 없이 호출 가능
        System.out.println("도넛 가게에 전화: " + phoneNumber);
    }
}

public class StaticMethodExample {
    public static void main(String[] args) {
        DonutInfo.callShop();      	        	// 도넛 가게에 전화: 02-123-4567
        System.out.println("전화번호: " + DonutInfo.phoneNumber);
    }
}