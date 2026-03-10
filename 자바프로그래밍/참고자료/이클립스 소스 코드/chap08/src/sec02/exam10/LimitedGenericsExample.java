package sec02.exam10;

class Donut {   
    int price;

    public Donut(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}

class ChocoDonut extends Donut {
    public ChocoDonut(int price) {
        super(price);
    }
}

class Box<T extends Donut> {        // Donut 클래스와 그 자식 클래스로 제한
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public void printPrice() {
        System.out.println("도넛의 가격: " + item.getPrice() + "원");
    }
}

public class LimitedGenericsExample {
    public static void main(String[] args) {
        ChocoDonut chocoDonut = new ChocoDonut(2500);
 
        Box<ChocoDonut> myBox1 = new Box<>();
        myBox1.setItem(chocoDonut);
        System.out.println("초코 도넛이 박스에 담겼습니다.");
        myBox1.printPrice();
    }
}