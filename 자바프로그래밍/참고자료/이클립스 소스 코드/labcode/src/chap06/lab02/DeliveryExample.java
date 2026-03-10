package chap06.lab02;

interface Deliverable {   // 배송 가능한 기능 정의(인터페이스)
    void pack(); 
    void ship();
    void confirm();
}

abstract class Product implements Deliverable { // 공통 속성의 추상 클래스
    String name;
    Product(String name) { this.name = name; }
}

class Book extends Product {    // 상품 1: 책
    Book(String name) { super(name); }

    public void pack()    { System.out.println(name + ": 책 포장"); }
    public void ship()    { System.out.println(name + ": 책 배송 중"); }
    public void confirm() { System.out.println(name + ": 책 수령 완료"); }
}

class Food extends Product {   // 상품 2: 식품
    Food(String name) { super(name); }

    public void pack()    { System.out.println(name + ": 식품 냉장 포장"); }
    public void ship()    { System.out.println(name + ": 냉장 배송 중"); }
    public void confirm() { System.out.println(name + ": 식품 수령 완료"); }
}

public class DeliveryExample {
    public static void main(String[] args) {
    	Deliverable[] items = {
            new Book("미라클 자바"),
            new Food("딸기 도넛")
        };

        for (Deliverable item: items) {
            item.pack();       // 다형성: 각 상품의 포장 방식
            item.ship();       // 다형성: 각 상품의 배송 방식
            item.confirm();    // 다형성: 수령 확인
        }
    }
}