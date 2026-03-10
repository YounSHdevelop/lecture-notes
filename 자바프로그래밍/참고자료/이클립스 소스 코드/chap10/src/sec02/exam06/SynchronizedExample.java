package sec02.exam06;

class SyncCounter { 
    private int count = 0;

    public synchronized void increment() {     // synchronized 키워드 추가
        count++; 	     // 이 한 줄의 코드가 사실은 여러 단계로 이루어져 있음
    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {   // Thread 클래스를 상속하여 스레드 생성
    private SyncCounter counter;

    public MyThread(SyncCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        SyncCounter counter = new SyncCounter();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread2.start();
        thread1.join(); 
        thread2.join();
        System.out.println("최종 카운트: " + counter.getCount());
    }
}