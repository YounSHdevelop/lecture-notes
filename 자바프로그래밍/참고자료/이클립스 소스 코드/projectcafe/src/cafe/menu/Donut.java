package cafe.menu;

// 도넛을 나타내는 클래스로, MenuItem 인터페이스를 구현
public class Donut implements MenuItem {
    private String name;
    private int price;


    // Donut 클래스의 생성자, , name 도넛의 이름, price 도넛의 가격
    public Donut(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}