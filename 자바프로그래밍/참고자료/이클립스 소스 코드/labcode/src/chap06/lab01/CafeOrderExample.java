package chap06.lab01;

class Beverage {   			// 부모 클래스
    String name;

    Beverage(String name) {
        this.name = name;
        System.out.println(name + " 음료 준비 시작");
    }

    void serve() {
        System.out.println(name + " 음료를 컵에 담아 서빙합니다.");
    }
}

class Coffee extends Beverage{   	// 상속된 자식 클래스 Coffee
    String beanType;

    Coffee(String name, String beanType) {
    	super(name); 			// 부모 생성자 호출
        this.beanType = beanType;
        System.out.println("원두 종류: " + beanType);
    }
    
    @Override
    void serve() {
        System.out.println(name + " 커피를 따뜻하게 서빙합니다.");
    }
}

class Juice extends Beverage {  	// 상속 된 자식 클래스 Juice
    String fruit;

    Juice(String name, String fruit) {
    	super(name);			// 부모 생성자 호출
        this.fruit = fruit;
        System.out.println("사용된 과일: " + fruit);
    }

    @Override
    void serve() {
        System.out.println(name + " 주스를 시원하게 서빙합니다.");
    }
}

public class CafeOrderExample  {
    public static void main(String[] args) {
        System.out.println("=== 커피 주문 ===");
        Coffee coffee = new Coffee("아메리카노", "에티오피아");
        coffee.serve();

        System.out.println("\n=== 주스 주문 ===");
        Juice juice = new Juice("오렌지 주스", "오렌지");
        juice.serve();
    }
}