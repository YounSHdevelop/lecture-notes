package sec01.exam03;

class MyTask implements Runnable { 	// Runnable 인터페이스 구현
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500);  		// 0.5초 대기
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }
    }
}

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyTask(), "1번 스레드");
        Thread thread2 = new Thread(new MyTask(), "2번 스레드");

        thread1.start();   	   // 스레드 시작
        thread1.join();          // thread1이 끝날 때까지 main 스레드 대기

        thread2.start();         // thread1이 끝난 후 thread2 시작
        thread2.join();         // thread2가 끝날 때까지 main 스레드 대기

        System.out.println("메인 스레드: 모든 작업이 완료되었습니다.");
    }
}