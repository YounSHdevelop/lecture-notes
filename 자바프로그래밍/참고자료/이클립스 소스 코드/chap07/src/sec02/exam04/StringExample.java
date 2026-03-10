package sec02.exam04;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "레몬도넛";

        System.out.println("문자열: " + s1);
        System.out.println("문자 수: " + s1.length());
        System.out.println("첫 글자: " + s1.charAt(0));
        System.out.println("부분 문자열: " + s1.substring(0, 2));
        System.out.println("바뀐 문자열: " + s1.replace("레몬", "초코"));

        String s2 = new String("레몬도넛");
        System.out.println("s1 == s2: " + (s1 == s2)); 	// false
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true

        String s3 = "레몬도넛";  	// 문자열 풀의 "레몬도넛" 참조
        System.out.println("s1 == s3: " + (s1 == s3)); 	// true
        s1 = s1 + " 포장";
        System.out.println("s1 변경 후 == s3: " + (s1 == s3)); // false
    }
}