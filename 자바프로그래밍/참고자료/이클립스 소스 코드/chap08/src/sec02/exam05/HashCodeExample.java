package sec02.exam05;

import java.util.HashSet;
import java.util.Objects;	// Objects.hash() 메서드 사용

class Donut {
    String name;

    Donut(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Donut)) return false;
        Donut donut = (Donut) obj;
        return name.equals(donut.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);	// 중복 방지를 위해 사용
    }

    @Override
    public String toString() {
        return name;
    }
}

public class HashCodeExample {
    public static void main(String[] args) {
        HashSet<Donut> set = new HashSet<>();
        set.add(new Donut("초코 도넛"));
        set.add(new Donut("크림 도넛"));
        set.add(new Donut("초코 도넛"));  	// 같은 이름의 도넛

        System.out.println("도넛 객체 저장 결과:");
        for (Donut donut : set) {
            System.out.println(donut);
        }
    }
}