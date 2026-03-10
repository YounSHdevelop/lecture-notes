package sec01.exam01;

public class VariableExample {
    public static void main(String[] args) {
        int price = 2000;      	// 정수형 변수 price 선언
        int sale = 1500;      	// int price = 2000, sale = 1500; 도 가능
        
        System.out.println("도넛 가격: " + price);	 // price 값 출력
        price = sale;                    		 // price에 sale 값 저장  
        System.out.println("세일 가격: " + price);	 // 새로운 price 값 출력
    }
}