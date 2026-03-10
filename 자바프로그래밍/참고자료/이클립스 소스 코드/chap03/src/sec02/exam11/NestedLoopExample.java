package sec02.exam11;

public class NestedLoopExample {
    public static void main(String[] args) {

        for (int dan = 2; dan <= 9; dan++) {    	// 외부 반복문: 2단부터 9단까지
            System.out.println("\n" + dan + "단:");
            
            for (int num = 1; num <= 9; num++) {    // 내부 반복문: 1부터 9까지
                System.out.print(dan + "x" + num + "=" + (dan * num) + ", ");
            }
        }
    }
}