package sec02.exam08;

class Donut {
    void show() {
        System.out.println("이것은 기본 도넛이다.");
    }
}

class ChocoDonut extends Donut {
    @Override
    void show() {
        System.out.println("이것은 달콤한 초코 도넛입니다.");
    }
}

class LemonDonut extends Donut {
    @Override
    void show() {
        System.out.println("이것은 상큼한 레몬 도넛입니다.");
    }
}

public class DynamicBindingExample {
    public static void main(String[] args) {
        Donut d1 = new Donut();
        Donut d2 = new ChocoDonut();
        Donut d3 = new LemonDonut();

        d1.show(); 	// 기본 도넛
        d2.show(); 	// 초코 도넛
        d3.show(); 	// 레몬 도넛
    }
}