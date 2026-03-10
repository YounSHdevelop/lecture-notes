package sec03.exam17;

public class JaggedArrayExample {
    public static void main(String[] args) {
        int[][] ja = new int[3][];		// 가변 객체 ja[3][] 선언	
        ja[0] = new int[] {1};			// 첫 번째 행: 1로 초기화
        ja[1] = new int[] {2, 3};		// 두 번째 행: 2, 3으로 초기화
        ja[2] = new int[] {4, 5, 6};	// 세 번째 행: 4, 5, 6으로 초기화

        for (int i = 0; i < ja.length; i++) {
            for (int j = 0; j < ja[i].length; j++) {
                System.out.print("[" + i + "][" + j + "]=" + ja[i][j] + ", ");
            }
            System.out.println();
        }
    }
}