package sec02.exam08;

class Buffer {
    private final int[] buf;     // 버퍼 배열
    private int count = 0;       // 현재 버퍼에 저장된 데이터 개수
    private int in = 0;          // 다음에 데이터를 넣을 위치
    private int out = 0;         // 다음에 데이터를 뺄 위치

    public Buffer(int size) {
        buf = new int[size];
    }

    public synchronized void put(int data) throws InterruptedException {
        while (count == buf.length) {           // 버퍼가 가득 찼으면 대기
            wait();
        }
        buf[in] = data;
        in = (in + 1) % buf.length;
        count++;
        System.out.println("생산: " + data + " | 버퍼 개수: " + count);
        notifyAll();         // 대기 중인 소비자 깨우기
    }

    public synchronized int get() throws InterruptedException {
        while (count == 0) {          // 버퍼가 비어 있으면 대기
            wait();
        }
        int data = buf[out];
        out = (out + 1) % buf.length;
        count--;
        System.out.println("소비: " + data + " | 버퍼 개수: " + count);
        notifyAll();          // 대기 중인 생산자 깨우기
        return data;
    }
}

class Producer extends Thread {   // 생산자 스레드
    private final Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.put(i);
                Thread.sleep(100); // 생산 속도 제어
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {   // 소비자 스레드
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                buffer.get();
                Thread.sleep(200); // 소비 속도 제어
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // 버퍼 크기 5
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}