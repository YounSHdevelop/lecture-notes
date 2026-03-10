package sec02.exam02;

class Donut {				
    int price; 	   			  
	
    Donut() { 			// 기본 생성자 – 다른 생성자가 없으면 자동 생성
        System.out.println("Donut 객체가 생성되었습니다.");
    }

    public void show() { 		  
        System.out.println(price + "원입니다.");
    }
}

public class ConstBasicExample {		
    public static void main(String[] args) {	    
        Donut d1 = new Donut();	// 기본 생성자 호출

        d1.price = 2000;
        d1.show();    		
    }
}