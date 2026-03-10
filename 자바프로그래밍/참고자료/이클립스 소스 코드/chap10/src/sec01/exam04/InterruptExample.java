package sec01.exam04;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("스레드 시작: " + Thread.currentThread().getName());
        try {
            System.out.println("5초 동안 대기합니다.");
            Thread.sleep(5000);  			// 5초 대기
            System.out.println("대기 완료!");
        } catch (InterruptedException e) {
            System.out.println("스레드 대기 중 인터럽트 발생!");
            Thread.currentThread().interrupt(); 	// 플래그를 다시 설정
        } finally {
            System.out.println("스레드 종료: " + Thread.currentThread().getName());
        }
    }
}

public class InterruptExample {
    public static void main(String[] args) throws InterruptedException {
        Thread workerThread = new MyThread();
        workerThread.start();

        Thread.sleep(2000);  			// 2초 대기
        System.out.println("메인 스레드에서 인터럽트 호출!");
        workerThread.interrupt(); 		// 인터럽트 호출
    }
}