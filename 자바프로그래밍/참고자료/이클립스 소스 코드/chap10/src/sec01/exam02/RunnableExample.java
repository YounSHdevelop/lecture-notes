package sec01.exam02;

class MyTask implements Runnable { // Runnable 인터페이스로 스레드 생성
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);  		// 0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        MyTask task = new MyTask();  // Runnable 구현 객체 생성
        Thread thread1 = new Thread(task, "1번 스레드");  // Thread 객체에 Runnable 전달
        Thread thread2 = new Thread(task, "2번 스레드");

        thread1.start();   // 스레드 시작
        thread2.start();
    }
}