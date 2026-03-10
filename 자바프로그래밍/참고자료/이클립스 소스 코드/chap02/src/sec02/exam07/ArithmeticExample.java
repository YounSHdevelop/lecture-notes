package sec02.exam07;

public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10, b = 3;
       
        System.out.println("-a = " + -a);  	        // -10 (부호 연산자) 
        System.out.println("a + b = " + (a + b));  	// 13
        System.out.println("a - b = " + (a - b));  	// 7
        System.out.println("a * b = " + (a * b));  	// 30
        System.out.println("a / b = " + (a / b));  	// 3 (소수점이하 버려짐)
        System.out.println("a % b = " + (a % b));  	// 1 (나머지)
    }
}