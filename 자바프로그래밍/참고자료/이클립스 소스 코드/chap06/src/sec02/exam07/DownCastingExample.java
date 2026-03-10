package sec02.exam07;

class Donut {  	// 부모 클래스
    String name;		

    void show() {		
        System.out.println(name + "입니다. ");
    }
}

class ChocoDonut extends Donut {  
    String topping;		           

    void addTopping() {	           
        System.out.println(topping + " 토핑 추가.");
    }
}

public class DownCastingExample {
    public static void main(String[] args) {
        Donut d = new ChocoDonut();			// 업캐스팅
        d.name = "초코 도넛";	   

        ChocoDonut choco = (ChocoDonut) d;  // 다운캐스팅(명시적 형변환)

        d.show();         		   			// Donut의 show() 사용
        choco.topping = "초코칩";	   
        choco.addTopping();   		   		// ChocoDonut의 addTopping() 사용
    }
}