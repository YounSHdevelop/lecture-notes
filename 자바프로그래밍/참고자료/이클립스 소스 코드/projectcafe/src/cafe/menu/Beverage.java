package cafe.menu;

 // 음료를 나타내는 클래스로, MenuItem 인터페이스를 구현
 // 이름과 가격 정보를 private 멤버 변수로 캡슐화

public class Beverage implements MenuItem {
    private String name;
    private int price;

    // Beverage 클래스의 생성자, name 음료의 이름, price 음료의 가격
    public Beverage(String name, int price) {
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