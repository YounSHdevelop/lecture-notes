package sec02.exam05;

class Donut {					
    final String name; 			// final 멤버변수 name 선언		    
    final int price; 	   		// final 멤버변수 price 선언	    

    Donut(String name, int price) {  // final 멤버변수 초기화, 이 후 변경 불가
        this.name = name;
        this.price = price;
    }					    
	
    public void show() { 		  
        System.out.println(name + " " + price + "원");
    }
}

public class FinalConstExample {		
    public static void main(String[] args) {	    
        Donut d1 = new Donut("기본 도넛", 2000);	    
        Donut d2 = new Donut("초코 도넛", 2800);	    
        Donut d3 = new Donut("생딸기 도넛", 3400);	    
	
        d1.show();    		
        d2.show();    		
        d3.show();

        // d1.price = 2200;  // 오류 final로 선언된 변수는 변경 불가	
    }
}