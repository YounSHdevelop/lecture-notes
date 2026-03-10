package sec01.exam03;

class Donut {
    Donut() {
        System.out.println("Donut 생성자 호출"); // 부모 생성자가 먼저 호출 됨
    }
}

class ChocoDonut extends Donut {
    ChocoDonut() {
        System.out.println("ChocoDonut 생성자 호출"); 
    }
}

public class ConstExistExample {
    public static void main(String[] args) {
        ChocoDonut choco = new ChocoDonut();
    }
}