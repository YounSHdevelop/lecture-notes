package chap10.lab01;

class Barista extends Thread {
    private String drinkName;

    public Barista(String drinkName) {
        this.drinkName = drinkName;
        this.setName("바리스타 스레드"); // 스레드 이름 설정
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + drinkName + " 준비 시작.");

        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + drinkName + " " + i + "단계 완료.");
                Thread.sleep(500); // 0.5초 대기 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + ": " + drinkName + " 준비 완료!");
    }
}

public class ThreadLab {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("메인 스레드: 오늘의 주문을 받습니다.");
        Barista barista1 = new Barista("아메리카노");
        Barista barista2 = new Barista("라떼");

        barista1.start();          // 스레드 시작
        barista2.start();

        barista1.join();
        barista2.join();

        System.out.println("메인 스레드: 모든 주문이 처리되었습니다.");
    }
}