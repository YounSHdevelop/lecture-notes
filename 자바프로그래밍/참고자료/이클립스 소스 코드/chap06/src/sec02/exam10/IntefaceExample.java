package sec02.exam10;

interface MakeDonut {	     // 인터페이스 선언 1
    default void make() {	       // 인터페이스 안에 미리 만들어 놓은 메서드
        System.out.println("미라클 도넛을 만듭니다.");
    }
}

interface Fillable {		// 인터페이스 선언 2
    void fill();
}

interface Decoratable {		// 인터페이스 선언 3
    void decorate();
}

interface DonutUtil {		// 인터페이스 선언 4
    static void printStart() {	// 객체 생성 없이 호출 가능
        System.out.println("=== 도넛 만들기 시작 ===");
    }
}

class Donut implements MakeDonut, Fillable, Decoratable { // 다증 인터페이스
    public Donut() {
        make();  		// 인터페이스 1 안의 default 메서드 자동 실행
    }

    public void fill() {		// 인터페이스 2 구현
        System.out.println("크림을 채웁니다.");
    }

    public void decorate() {	// 인터페이스 3 구현
        System.out.println("초코 토핑을 얹습니다.");
    }
}

public class IntefaceExample {
    public static void main(String[] args) {
        DonutUtil.printStart();   // static 메서드 실행
        Donut d = new Donut();    // 생성자 안의 make() 자동 실행
        d.fill();
        d.decorate();
    }
}