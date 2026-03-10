package sec02.exam10;

public class LogicalExample {
    public static void main(String[] args) {
        boolean a = true, b = false;

        System.out.println("!a: " + !a);                // false       
        System.out.println("a && b: " + (a && b));  	// false
        System.out.println("a || b: " + (a || b));  	// true
    }
}