package sec03.exam15;

public class StringArrayExample {
    public static void main(String[] args) {
        String[] donutBox = { "기본", "크림", "초코" };

        for (int i = 0; i < donutBox.length; i++) {	  // .length = 3
            System.out.println(donutBox[i] + " 도넛");
        }
    }
}