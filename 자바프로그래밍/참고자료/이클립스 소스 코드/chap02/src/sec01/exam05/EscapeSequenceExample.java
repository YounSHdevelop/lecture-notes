package sec01.exam05;

public class EscapeSequenceExample {
    public static void main(String[] args) {
        char quotes = '\"';         		// 단일 문자

        System.out.print("\t탭 \n");  
        System.out.print(quotes + "따옴표 \'와 \u0041와 \\" + quotes);  
    }
}