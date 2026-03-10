package sec01.exam01;

class Donut {  	// 부모 클래스
    String name;		// 공통 변수
    int price;			// 공통 변수

    void show() {		// 공통 메소드
        System.out.println(name + "의 가격은 " + price + "원");
    }
}

class ChocoDonut extends Donut {  // Donut 클래스를 상속받는 ChocoDonut 클래스
    String topping;		           // name 및 price 사용가능 + topping

    void addTopping() {	           // show() 사용가능 + addtopping()
        System.out.println(topping + " 토핑 추가");
    }
}

public class InheritExample {
    public static void main(String[] args) {
        ChocoDonut choco = new ChocoDonut();
        choco.name = "초코 도넛";	   	// Donut의 name 사용
        choco.price = 2000;		   	// Donut의 price 사용
        choco.topping = "초코 칩";  	// ChocoDonut의 topping 사용

        choco.show();         		// Donut의 show() 사용
        choco.addTopping();   		// ChocoDonut의 addTopping() 사용
    }
}