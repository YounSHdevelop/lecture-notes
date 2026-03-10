package sec02.exam05;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("도넛");
        System.out.println("초기 문자열: " + sb);

        sb.append(" 가게");            // 문자열 뒤에 추가
        System.out.println("append 후: " + sb);

        sb.insert(2, " 맛있는");     	// 문자열 중간에 삽입
        System.out.println("insert 후: " + sb);

        sb.delete(2, 6); 		// " 맛있는" 삭제
        System.out.println("delete 후: " + sb);

        sb.replace(0, 2, "초코");    	// 문자열 변경
        System.out.println("replace 후: " + sb);

        sb.reverse(); 			// 문자열 뒤집기
        System.out.println("reverse 후: " + sb);

        String result = sb.toString(); // String으로 변환
        System.out.println("최종 문자열(String): " + result);
    }
}