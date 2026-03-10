package sec02.exam07;

class SyncBlockCounter {
    private int count = 0;
    private final Object lock = new Object(); // 잠금 역할을 하는 객체

    public void increment() {
        synchronized (lock) { 	   // count++ 부분에만 synchronized 블록 적용
            count++;
        }
    }

    public int getCount() {
        return count; 		// 이 메서드는 동기화가 필요 없음
    }
}

class MyThread extends Thread {   // Thread 클래스를 상속하여 스레드 생성
    private SyncBlockCounter counter;

    public MyThread(SyncBlockCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            counter.increment();
        }
    }
}

public class SyncBlockExample {
    public static void main(String[] args) throws InterruptedException {
        SyncBlockCounter counter = new SyncBlockCounter();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread2.start();
        thread1.join(); 
        thread2.join();
        System.out.println("최종 카운트: " + counter.getCount());
    }
}