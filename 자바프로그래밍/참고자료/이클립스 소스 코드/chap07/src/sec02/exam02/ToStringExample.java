package sec02.exam02;

class Donut {
    String name;
    int price;

    Donut(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
     public String toString() {	// Object의 toString() 오버라이딩
         return name + " 도넛(" + price + "원)";
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        Donut d1 = new Donut("초코", 2000);
        System.out.println(d1);      	// 자동으로 toString() 호출
    }
}