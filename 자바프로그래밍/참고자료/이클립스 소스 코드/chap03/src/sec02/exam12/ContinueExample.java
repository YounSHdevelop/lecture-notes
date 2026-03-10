package sec02.exam12;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue; 			// 3의 배수인 경우 건너뜀
            }
            System.out.println(i); 	// 3의 배수가 아닌 숫자만 출력됨
        }
    }
}