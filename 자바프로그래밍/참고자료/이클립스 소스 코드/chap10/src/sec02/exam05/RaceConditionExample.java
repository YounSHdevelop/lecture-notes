package sec02.exam05;

class Counter {
    private int count = 0;

    public void increment() {
        count++; // 이 한 줄의 코드가 사실은 여러 단계로 이루어져 있습니다.
    }

    public int getCount() {
        return count;
    }
}

class ThreadExample extends Thread {
    private Counter counter;

    public ThreadExample(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            counter.increment();
        }
    }
}

public class RaceConditionExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ThreadExample thread1 = new ThreadExample(counter);
        ThreadExample thread2 = new ThreadExample(counter);

        thread1.start();
        thread2.start();
        thread1.join(); 
        thread2.join();
        System.out.println("최종 카운트: " + counter.getCount());
    }
}