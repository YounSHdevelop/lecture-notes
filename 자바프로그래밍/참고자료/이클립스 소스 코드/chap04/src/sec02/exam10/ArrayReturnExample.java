package sec02.exam10;

public class ArrayReturnExample {       // 새로운 배열을 만들어 반환하는 메서드
    public static int[] createArray() {		// 반환형 int[]
        int[] arr = {5, 10, 15};
        return arr;
    }

    public static void main(String[] args) {
        int[] price = createArray();	    // 배열의 주소를 반환 받음

        for (int n : price) {
            System.out.print(n + " ");
        }
    }
}