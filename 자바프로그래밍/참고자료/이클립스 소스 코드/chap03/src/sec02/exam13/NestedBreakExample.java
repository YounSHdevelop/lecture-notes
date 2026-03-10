package sec02.exam13;

public class NestedBreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) break;  		// 내부 반복문만 빠져나옴
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}