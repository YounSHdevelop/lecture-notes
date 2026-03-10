package sec03.exam11;

class Donut {					
    String name;
    int price;	   			    

    Donut(String name, int price) { 
        this.name = name;      
        this.price = price;    
    }

    public void show() {
        System.out.println(name + "의 가격은 " + price + "원.");
    }
}

public class ObjectArrayExample {		
    public static void main(String[] args) {	    
        Donut[] donuts = new Donut[3];	   	// Donut 객체 배열 생성

        donuts[0] = new Donut("초코 도넛", 2500); 
	donuts[1] = new Donut("딸기 도넛", 2800);
        donuts[2] = new Donut("너트 도넛", 3200);
        
        for (int i = 0; i < donuts.length; i++) {	
            donuts[i].show();    			// 각 도넛 정보 출력
        }		
    }
}