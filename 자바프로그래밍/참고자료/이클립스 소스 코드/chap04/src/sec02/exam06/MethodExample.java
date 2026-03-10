package sec02.exam06;

class Donut {
    int price;
   
    Donut() {				    			// 기본 생성자, price=2000으로 초기화
        this.price = 2000;
    }

    public int getPrice() {		    		// 원래 가격 반환 메서드
        return this.price;
    }

    public int getDiscount(int discount) {  // 할인된 가격 반환 메서드
        int result = this.price - discount;
        return result;    		    
    }
}

public class MethodExample {   
    public static void main(String[] args) {  // return 값이 없음으로 void
        Donut d1 = new Donut();	 	      

        int resultPrice = d1.getDiscount(500);  // 메서드 호출
        System.out.println("원래 가격: " + d1.getPrice() + "원");
        System.out.println("할인 가격: " + resultPrice + "원");
    }
}