package chap10.lab02;

class DeliveryApp {
    private int income = 0;

    public synchronized void addIncome(int amount) {
        int currentIncome = this.income;
        try {
            Thread.sleep(10); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.income = currentIncome + amount;
        System.out.println(Thread.currentThread().getName() + "이 " + (amount/1000) + "번째 배달을 완료했습니다. (수입: " + this.income + ")");
    }

    public int getIncome() {
        return income;
    }
}

class DeliveryMan extends Thread { // 배달원 스레드
    private DeliveryApp app;

    public DeliveryMan(DeliveryApp app, String name) {
        this.app = app;
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "이 배달을 시작합니다.");
        for (int i = 0; i < 10; i++) {
            app.addIncome(1000); // 1000원씩 10번 배달
        }
    }
}

public class SyncDeliveryLab {
    public static void main(String[] args) throws InterruptedException {
        DeliveryApp app = new DeliveryApp();
        DeliveryMan man1 = new DeliveryMan(app, "배달원1");
        DeliveryMan man2 = new DeliveryMan(app, "배달원2");

        man1.start();
        man2.start();
        man1.join();
        man2.join();
        System.out.println("최종 수입: " + app.getIncome());
    }
}