package chap05.lab03;

public class DeliveryApp {                       // 음식점 클래스 정의
    static class DeliveryStore {
        String name;
        int fee;

        DeliveryStore(String name, int fee) {        
            this.name = name;
            this.fee = fee;
        }
        
        static void show(DeliveryStore[] stores, int standardFee) {
            for (DeliveryStore s: stores) {
                if (s.fee < standardFee) {
                    System.out.println(s.name + ": 저렴-" + s.fee + "원");
                } else if (s.fee == standardFee) {
                    System.out.println(s.name + ": 평균-" + s.fee + "원");
                } else {
                    System.out.println(s.name + ": 비쌈-" + s.fee + "원");
                }
            }
        }
    }

    public static void main(String[] args) {
        DeliveryStore[] stores = {	                // 음식점 객체 배열 생성
            new DeliveryStore("피자나라", 3000),
            new DeliveryStore("치킨왕국", 2000),
            new DeliveryStore("분식천국", 1500)
        };

        int standard = 2000;
        System.out.println("[기준 배달료 " + standard + "원과 비교]");
        DeliveryStore.show(stores, standard);        // 배열을 전달하여 출력
    }
}