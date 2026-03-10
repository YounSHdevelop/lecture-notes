package sec02.exam04;

class Donut {					
    String name;
    int price;	   			    

    Donut() {		// 기본 생성자
        this("기본 도넛", 2000);  // this() 생성자: 다른 생성자 호출
    }

    Donut(String name, int price) { // 모든 필드를 초기화하는 생성자
        this.name = name;      			// this.name는 멤버 변수, name은 매개변수
        this.price = price;    			// this.price는 멤버 변수, price는 매개변수
    }

    public void show() {
        System.out.println(name + "의 가격은 " + price + "원입니다.");
    }
}

public class ThisConstExample {		
    public static void main(String[] args) {	    
        Donut d1 = new Donut();	    			   // 기본 생성자 호출
        d1.show();    		
	
        Donut d2 = new Donut("딸기 도넛", 2800);  // 매개변수 2개의 생성자 호출
        d2.show();    		
    }
}