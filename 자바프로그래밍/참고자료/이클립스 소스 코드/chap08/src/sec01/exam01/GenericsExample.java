package sec01.exam01;

class Box<T> {    	// 제네릭 클래스 Box<T> 선언
    private T item; 			// T 타입의 인스턴스 변수
   
    public Box(T item) {    		// 생성자
        this.item = item;
    }
    
    public T getItem() {  		// getter 
        return this.item;
    }
   
    public void setItem(T item) {   	// setter
        this.item = item;
    }
}    

class Donut {    			// Donut 클래스 정의
    private String name;

    public Donut(String name) {	// 생성자
        this.name = name;
    }

    public String getName() {		// getter 
        return name;
    }
}

public class GenericsExample {    
    public static void main(String[] args) {            

        Donut myDonut = new Donut("초코 도넛");  	// 도넛 객체 생성
        Box<Donut> myBox = new Box<>(myDonut);	// 도넛 박스 생성

        Donut d1 = myBox.getItem();          		// 상자에서 도넛 꺼내기
        System.out.println("상자에서 꺼낸 도넛: " + d1.getName());
    }
}