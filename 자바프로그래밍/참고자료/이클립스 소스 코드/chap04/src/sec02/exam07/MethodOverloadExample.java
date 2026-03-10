package sec02.exam07;

class Donut {
    String name;
    int price;
    String taste;

    Donut(String name, int price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }
    
    void show() {  							// 이름만 출력
        System.out.println(name);
    }

    void show(int price) { 					// 이름과 가격 출력
        System.out.println(name + ", 가격: " + price + "원");
    }

    void show(int price, String taste) {	// 이름, 가격, 맛 출력
        System.out.println(name + ", 가격: " + price + "원, 맛: " + taste);
    }
}

public class MethodOverloadExample {
    public static void main(String[] args) {
        Donut d1 = new Donut("초코 도넛", 1500, "달콤함");

        d1.show();             				// 이름만 출력
        d1.show(d1.price);     				// 이름과 가격 출력
        d1.show(d1.price, d1.taste);    	// 이름, 가격, 맛 출력
    }
}