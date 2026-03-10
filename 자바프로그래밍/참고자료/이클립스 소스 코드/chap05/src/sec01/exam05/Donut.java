package sec01.exam05;

public class Donut {
    private final String name;  // final 멤버 변수, 설정 후 변경 불가능
    private int price;	 	  // private으로 외부 접근 차단

    public Donut(String name) { // 생성자: final 멤버 변수 name 초기화
        this.name = name;	 
    }

    public String getName() {   // name 변수 게터
        return name;		  // name 변수 세터가 없음으로 변경 불가
    }

    public int getPrice() {     // price 변수 게터
        return price;
    }

    public void setPrice(int price) {   // 유효성 검사가 포함된 price 변수 세터
        if (price >= 0 && price <= 10000) {
            this.price = price;
        } else {
            System.out.println("가격은 0원 이상 10,000원 이하만 가능!");
        }
    }
}