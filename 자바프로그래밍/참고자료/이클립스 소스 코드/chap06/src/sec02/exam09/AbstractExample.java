package sec02.exam09;

abstract class Donut {   // 추상 클래스
    String name;
    int price;

    void setPrice(int price) {
        this.price = price;
    }
   
    abstract void show();    	// 추상 메서드
}

class ChocoDonut extends Donut {  
    @Override
    void show() {				// 추상 메서드 show() 구현
        System.out.println("달콤한 초코 도넛입니다. 가격: " + price + "원");
    }
}

class LemonDonut extends Donut {  
    @Override
    void show() {				// 추상 메서드 show() 구현
        System.out.println("상큼한 레몬 도넛입니다. 가격: " + price + "원");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // Donut d = new Donut(); // 오류 발생. 추상 클래스는 객체 생성 불가

        Donut choco = new ChocoDonut();   // 자식 클래스로 객체 생성
        choco.setPrice(2000);
        choco.show();

        Donut lemon = new LemonDonut();   // 다른 자식 클래스도 동일
        lemon.setPrice(2800);
        lemon.show();
    }
}