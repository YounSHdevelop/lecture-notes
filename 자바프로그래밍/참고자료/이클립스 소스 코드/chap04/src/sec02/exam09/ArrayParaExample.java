package sec02.exam09;

public class ArrayParaExample {        // 배열의 모든 요소에 10을 더하는 메서드
    public static void increaseAll(int[] arr) { // 매개변수로 배열의 주솟값을 받음
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }
    }

    public static void main(String[] args) {
        int[] price = {1, 2, 3};

        increaseAll(price);		        // price의 주솟값을 복사하여 전달
        for (int n : price) {
            System.out.print(n + " ");
        }
    }
}