package sec02.exam08;

public class BasicParaExample {  
    public static void increase(int value) {	    // 매개변수로 정수를 받음
        value += 10;
        System.out.println("increase : " + value);
    }

    public static void main(String[] args) {
        int price = 5;

        increase(price);		            // price의 값을 복사하여 전달
        System.out.println("main : " +  price);
    }
}