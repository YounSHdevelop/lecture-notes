package sec01.exam02;

class Donut {
    String name = "기본 도넛";
}

class ChocoDonut extends Donut {
    String name = "초코 도넛";

    void printName() {
        System.out.println("자식 클래스 name: " + name);        // 초코 도넛
        System.out.println("부모 클래스 name: " + super.name);  // 기본 도넛
    }
}

public class SuperExample {
    public static void main(String[] args) {
        ChocoDonut choco = new ChocoDonut();
        choco.printName();
    }
}