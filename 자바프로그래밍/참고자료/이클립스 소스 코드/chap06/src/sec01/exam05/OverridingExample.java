package sec01.exam05;

class Donut {
    void show() {
        System.out.println("이것은 기본 도넛이다.");
    }
}

class ChocoDonut extends Donut {
    @Override
    void show() {		// 부모 클래스의 show() 메서드 오버라이딩
        System.out.println("이것은 달콤한 초코 도넛이다.");
    }
}

class LemonDonut extends Donut {
    @Override
    void show() {		// 부모 클래스의 show() 메서드 오버라이딩
        System.out.println("이것은 상큼한 레몬 도넛이다.");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Donut basic = new Donut();
        ChocoDonut choco = new ChocoDonut();
        LemonDonut lemon = new LemonDonut();

        basic.show();      	// 기본 도넛
        choco.show();      	// 초코 도넛
        lemon.show(); 		// 레몬 도넛
    }
}