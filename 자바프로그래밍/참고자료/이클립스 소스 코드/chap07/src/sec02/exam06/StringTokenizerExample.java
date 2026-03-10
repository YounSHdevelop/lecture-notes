package sec02.exam06;

import java.util.StringTokenizer; 	// StringTokenizer는 java.util에 있음

public class StringTokenizerExample {
    public static void main(String[] args) {
        String donutMenu = "초코,레몬,딸기,크림";

        // 쉼표(,)를 기준으로 문자열을 분리
        StringTokenizer st = new StringTokenizer(donutMenu, ",");

        System.out.println("메뉴에 있는 도넛 종류:");

         while (st.hasMoreTokens()) {       // 토큰이 남아있는 동안 반복
            String donut = st.nextToken();	 // 다음 토큰 꺼냄
            System.out.println("- " + donut + " 도넛");
        }
    }
}