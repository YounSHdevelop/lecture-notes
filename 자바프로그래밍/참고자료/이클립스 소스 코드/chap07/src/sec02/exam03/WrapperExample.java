package sec02.exam03;

public class WrapperExample {
    public static void main(String[] args) {

        Integer num1 = 100;  			// 오토박싱: int → Integer
        System.out.println("오토박싱된 값: " + num1);
        
        int i = num1;      			// 언박싱: Integer → int 
        System.out.println("언박싱된 값: " + i);
        
        String s = "123";
        int j = Integer.parseInt(s); 		// 문자열을 숫자로 변환
        System.out.println("문자열을 정수로 변환: " + j);

        String str = Integer.toString(j); 	// 숫자를 문자열로 변환
        System.out.println("정수를 문자열로 변환: " + str);

        String yes = "true";
        Boolean flag = Boolean.parseBoolean(yes); // 문자열 → boolean 객체
        if (flag) {
            System.out.println("참이다.");
        } else {
            System.out.println("거짓이다.");
        }
    }
}