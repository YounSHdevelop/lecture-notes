package sec03.exam16;

public class MultipleArrayExample {
    public static void main(String[] args) {
       String[][] name = {			// 2행 3열의 배열선언 및 초기화
            {"기본", "크림", "초코"},
            {"크런치", "망고", "생딸기"}
        };

        for (int i = 0; i < name.length; i++) {	// 2행 반복
            for (int j = 0; j < name[i].length; j++) {	// 3열 반복
                System.out.println("도넛[" + i + "][" + j + "]=" + name[i][j]);
             }
        }
    }
}