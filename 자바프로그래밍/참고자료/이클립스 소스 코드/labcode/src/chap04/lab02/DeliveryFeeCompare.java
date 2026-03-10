package chap04.lab02;

public class DeliveryFeeCompare {

    static class Restaurant {
        String name;
        int basePrice, deliveryFee, totalCost;

        Restaurant(String name, int basePrice) {
            this(name, basePrice, 0);
        }

        Restaurant(String name, int basePrice, int deliveryFee) {
            this.name = name;
            this.basePrice = basePrice;
            this.deliveryFee = deliveryFee;
            this.totalCost = basePrice + deliveryFee;
        }

        void print() {
            System.out.println("[" + name + "]");
            System.out.println("음식 가격: " + basePrice + "원");
            System.out.println("배달료: " + deliveryFee + "원");
            System.out.println("총 결제 금액: " + totalCost + "원\n");
        }
    }

    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("김밥천국", 12000, 2000);
        Restaurant r2 = new Restaurant("버거킹", 9000, 3000);
        Restaurant r3 = new Restaurant("피자스쿨", 13000); 

        r1.print();
        r2.print();
        r3.print();
    }
}