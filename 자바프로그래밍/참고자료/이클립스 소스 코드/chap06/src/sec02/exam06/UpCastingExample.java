package sec02.exam06;

class Donut {  	// 부모 클래스
    String name;		

    void show() {		
        System.out.println(name + "입니다.");
    }
}

class ChocoDonut extends Donut {  
    String topping;		           

    void addTopping() {	           
        System.out.println(topping + " 토핑 추가.");
    }
}

public class UpCastingExample {
    public static void main(String[] args) {
        ChocoDonut choco = new ChocoDonut();
        choco.name = "초코 도넛";	   
        choco.topping = "초코칩";	   

        Donut d = choco;		   // 업캐스팅(자동 형변환)

        d.show();         		   // Donut의 show() 사용
        choco.addTopping();   	   // ChocoDonut의 addTopping() 사용
        // d.addTopping();         // 오류 : addTopping() 사용 불가
    }
}