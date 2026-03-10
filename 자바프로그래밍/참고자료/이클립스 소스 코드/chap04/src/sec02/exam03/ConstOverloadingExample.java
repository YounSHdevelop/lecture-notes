package sec02.exam03;

class Donut {					
    int price; 	   			    

    Donut() { 				 	// 기본 생성자: price를 2000으로 초기화
        price = 2000;
    }					    

    Donut(int p) { 		       	// price를 전달 받은 가격으로 초기화
        price = p;
    }					    
	
    public void show() { 		  
        System.out.println(price + "원입니다.");
    }
}

public class ConstOverloadingExample {		
    public static void main(String[] args) {	    
        Donut d1 = new Donut();	   	// 기본 생성자 호출	
        d1.show();    		

        Donut d2 = new Donut(1500);	// 매개변수가 1개인 생성자 호출
        d2.show();    		
    }
}