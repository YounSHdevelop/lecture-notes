package sec01.exam01;

class MyThread extends Thread { // Thread 클래스를 상속하여 스레드 생성
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

public class MultiThreadExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();  // Thread 타입 객체 thread1 생성
        MyThread thread2 = new MyThread();  // Thread 타입 객체 thread2 생성

        thread1.start();  		       // thread1 시작
        thread2.start();  		       // thread2 시작
    }
}