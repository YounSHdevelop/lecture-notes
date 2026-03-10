package sec02.exam11;

public class BitwiseExample {
    public static void main(String[] args) {
        int a = 6;  		// 6은 이진수로 0110
        int b = 3;  		// 3은 이진수로 0011

        System.out.println("a & b: " + (a & b));      // AND: 0010 = 2
        System.out.println("a | b: " + (a | b));      // OR:  0111 = 7
        System.out.println("a ^ b: " + (a ^ b));      // XOR: 0101 = 5
        System.out.println("~a: " + (~a));            // NOT: 1111 1001 = -7 
        System.out.println("a << 1: " + (a << 1));    // 좌측 1칸: 1100 = 12
        System.out.println("a >> 1: " + (a >> 1));    // 우측 1칸: 0011 = 3
        System.out.println("a >>> 1: " + (a >>> 1));  // 우측 1칸: 0011 = 3
    }
}