package chap03.lab03;

public class HorseRace {
    public static void main(String[] args) throws InterruptedException {
        int[] horse = new int[7];		       // 7개의 정수형 배열 horse
        
        boolean go = true;			// while 탈출 조건
        int win = -1;				// 승리한 말 번호 저장

        while (go) {
            for (int i = 0; i < 7; i++) System.out.println();   //화면지우기
            for (int k = 0; k < horse.length; k++) {	           // 배열 각 원소 반복
                horse[k] = horse[k] + (int) (Math.random() * 10);  
                for (int m = 0; m < horse[k]; m++) {
                    System.out.print(" ");		                    // 공백문자 출력
                }
                System.out.println(k + ":>");		            // 말 번호 출력
                if (horse[k] > 100) {			            // 결승점 도착
                    win = k;				                    // 승리한 번호 저장
                    go = false;			                    // while 문 탈출
                }
            }
            Thread.sleep(1000);  			                    // 1000밀리초(1초) 대기
        }
        System.out.println("< " + win + "번 말 승리 >");     // 승리한 말 출력
    }
}