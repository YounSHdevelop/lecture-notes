package sec01.exam03;

public class ConstantExample {
    public static void main(String[] args) {
        final int MAX_BOX_SIZE = 4;  	  // 상수 선언과 동시에 초기화 해야 함
        
        // MAX_BOX_SIZE = 6;  		  // 오류 발생 (상수는 값을 변경할 수 없음)  
        System.out.println("도넛 박스 크기: " + MAX_BOX_SIZE + "개");
    }
}