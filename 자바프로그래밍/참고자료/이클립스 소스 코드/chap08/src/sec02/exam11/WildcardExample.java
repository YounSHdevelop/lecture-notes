package sec02.exam11;

class Donut {   
    String name;

    public Donut(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class ChocoDonut extends Donut {
    public ChocoDonut(String name) {
        super(name);
    }
}

class Box<T> {        
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class WildcardExample {
    public static void printBox(Box<?> box) {
        System.out.println("상자에 담긴 도넛: " + box.getItem());
    }

    public static void main(String[] args) {
        Box<Donut> myBox = new Box<>();
        myBox.setItem(new Donut("기본 도넛"));
        printBox(myBox);

        Box<ChocoDonut> chocoBox = new Box<>();
        chocoBox.setItem(new ChocoDonut("초코 도넛"));
        printBox(chocoBox);
    }
}