package chap08.lab01;

class BookBox<T> {  						// 제네릭 클래스 선언
    private T item;
    
    public void setItem(T item) {	        // 세터(setter) 
        this.item = item;
    }

    public T getItem() {					// 게터(getter) 
        return item;
    }
}

public class GenericsLab {
    public static void printString(String item) {
        System.out.println("아이템: " + item);
    }
    
    public static void printInteger(Integer item) {
        System.out.println("아이템: " + item);
    }
    
    public static void main(String[] args) {
    	BookBox<String> titleBox = new BookBox<>(); // 제네릭 BookBox 객체 생성
        titleBox.setItem("미라클 자바");
        System.out.println("상자 속 책 제목: " + titleBox.getItem());
        
        BookBox<Integer> priceBox = new BookBox<>();
        priceBox.setItem(33000);
        System.out.println("상자 속 책 가격: " + priceBox.getItem() + "원");
        
        printString("미라클 HTML");
        printInteger(32000);
    }
}