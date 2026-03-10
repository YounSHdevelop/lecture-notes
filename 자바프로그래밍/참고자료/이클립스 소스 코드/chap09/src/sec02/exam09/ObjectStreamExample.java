package sec02.exam09;

import java.io.*;

class Donut implements Serializable {

    private String name;
    private int price;
    private boolean hasStock;

    public Donut(String name, int price, boolean hasStock) {
        this.name = name;
        this.price = price;
        this.hasStock = hasStock;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 가격: " + price + "원, 재고 있음: " + hasStock;
    }
}

public class ObjectStreamExample {
    public static void main(String[] args) {
        Donut myDonut = new Donut("딸기 잼 도넛", 2800, true);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("donut.obj"))) {
            out.writeObject(myDonut);
            System.out.println("도넛 객체가 파일에 저장됨.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("donut.obj"))) {
            Donut readDonut = (Donut) in.readObject(); 
            System.out.println("\n파일에서 도넛 객체 읽기:");
            System.out.println(readDonut);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}