package sec02.exam06;

class Donut {
    String name;  		// 도넛 이름
    int sales = 0;    			// 이 도넛의 개별 판매량 - 초기값은 0

    static int totalSales = 0;  // static은 전체 객체가 공유하는 변수

    public Donut(String name) {
        this.name = name;
    }

     public void sell() {
        this.sales++;			// 이 도넛의 개별 판매량 1증가 
        Donut.totalSales++;		// 전체 도넛 판매량 1 증가
        System.out.println(this.name + " 총 판매량: " + this.sales + "개");
        System.out.println("도넛 전체 판매량: " + Donut.totalSales + "개");
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        Donut choco = new Donut("초코 도넛");
        Donut lemon = new Donut("레몬 도넛");
        Donut nut = new Donut("너트 도넛");

        choco.sell(); 		// 초코 도넛 1개 판매
        lemon.sell(); 		// 레몬 도넛 1개 판매
        nut.sell();   		// 너트 도넛 1개 판매
        lemon.sell(); 		// 레몬 도넛 1개 더 판매
    }
}