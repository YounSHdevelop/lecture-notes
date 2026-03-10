package sec02.exam01;

class Donut {
    String name;

    Donut(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {	// Object의 equals() 오버라이딩
        if (obj instanceof Donut) {
            Donut other = (Donut) obj;            // Donut으로 다운 캐스팅
            return this.name.equals(other.name); 
        }
        return false;
    }
}

public class EqualsExample {
    public static void main(String[] args) {
        Donut d1 = new Donut("초코");
        Donut d2 = new Donut("초코");

        System.out.println("equals 결과: " + d1.equals(d2));  // 내용 비교
        System.out.println("== 결과: " + (d1 == d2));      	 // 주소 비교
    }
}