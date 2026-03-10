package sec01.exam01;

class Donut {				      		// Donut 클래스
    int price; 	   			           			// 멤버 변수 price
	
    public void show() { 		           		// 멤버 메서드 show()
        System.out.println(price + "원입니다.");
    }
}

public class DonutExample {		      	// DonutExample 클래스
    public static void main(String[] args) {	   // 프로그램 시작점
        Donut d1 = new Donut();	            	   // Donut 객체 d1 생성
        Donut d2 = new Donut();	               // Donut 객체 d2 생성

        d1.price = 2000;		                   // d1의 변수 price에 2000 저장
        d2.price = 3000;		                   // d2의 변수 price에 3000 저장
        d1.show();    		
        d2.show();    		
    }
}