package sec02.exam09;

class Box<T> {    	// 제네릭 클래스 Box<T> 선언
    private T item; 			// T 타입의 인스턴스 변수
    
    public T getItem() {  		// T 타입 객체를 반환하는 메서드
        return this.item;
    }
   
    public void setItem(T item) {   	// T 타입 객체를 설정하는 메서드
        this.item = item;
    }
}

public class GenericsMethodExample {
    public static <T> void printItem(T item) {   	// 제네릭 메서드
        System.out.println("아이템: " + item);
    }

    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.setItem("초코 도넛");
       
        printItem(nameBox.getItem());   		// 제네릭 메서드 호출
        printItem(2500); 		   		// 정수도 문제없이 처리
    }
}