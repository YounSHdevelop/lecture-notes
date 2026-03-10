package sec02.exam08;

public class ForExample {
    public static void main(String[] args) {
        int order;

        for (order = 3; order > 0; order--) {
            System.out.println("order = " + order + ", 도넛 만들기");
        }
        System.out.println("order = " + order);
    }
}