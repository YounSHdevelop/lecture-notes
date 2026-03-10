package sec02.exam08;

class Donut {
    static final double DISCOUNT_RATE = 0.1;    // 할인율
    static final String SHOP_NAME = "미라클 도넛";	// 가게이름
    String name;
    int price;
 
    Donut(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void price() {
        System.out.println(name + " 가격은 " + price + "원");
        int result = price - (int)(price * DISCOUNT_RATE);
        System.out.println("할인된 가격은 " + result + "원"); ;
    }
}

public class StaticFinalExample {
    public static void main(String[] args) {
        Donut d1 = new Donut("초코 도넛", 3000);

        System.out.println(Donut.SHOP_NAME + "에 오신 걸 환영합니다.");
        System.out.println("할인율은 " + Donut.DISCOUNT_RATE + "입니다.");
        d1.price();

         // Donut.DISCOUNT_RATE = 0.9; //오류: final은 변경 불가
    }
}