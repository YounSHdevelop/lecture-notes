package chap05.lab01.exam01;

public class DonutMenu {   
    String[] staffOnly = { "직원 전용 도넛", "비밀 음료" };  

    public void showStaffMenu() {              
        System.out.println("직원 전용: " + staffOnly[0] + ", " + staffOnly[1]);
    }
}