package sec01.exam04;

class Donut {
    String name;
							// 기본 생성자 Donut() {} 없음
    Donut(String name) {
        this.name = name;
        System.out.println(name + "맛 Donut 생성자 호출");
    }
}

class ChocoDonut extends Donut {
    String topping;

    ChocoDonut(String name, String topping) {
        super(name);   		// 부모 생성자를 명시적으로 호출
        this.topping = topping;
        System.out.println("ChocoDonut 생성자 " + topping +  " 추가");
    }
}

public class NoConstExample {
    public static void main(String[] args) {
        ChocoDonut choco = new ChocoDonut("초코", "초코칩");
    }
}