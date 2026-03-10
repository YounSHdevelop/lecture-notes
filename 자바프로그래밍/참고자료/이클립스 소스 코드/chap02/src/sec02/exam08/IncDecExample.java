package sec02.exam08;

public class IncDecExample {
    public static void main(String[] args) {

        int a = 5, b = 5;
        System.out.println("전위: ++a = " + ++a);  		
        System.out.println("후위: b++ = " + b++ + " 끝난 후: b = " + b);

        int c = 5, d = 5;
        System.out.println("\n전위: --c = " + --c);  	
        System.out.println("후위: d-- = " + d-- + " 끝난 후: d = " + d);
    }
}