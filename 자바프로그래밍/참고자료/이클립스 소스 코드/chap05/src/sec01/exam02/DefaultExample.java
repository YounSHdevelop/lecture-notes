package sec01.exam02;

class DonutMenu {		    	// default 접근 제한자 (생략되어 있음)
    String[] staffOnly = { "직원 전용 도넛", "비밀 음료" };

    void showStaffMenu() {
        System.out.println("직원 전용: " + staffOnly[0] + ", " + staffOnly[1]);
    }
}

public class DefaultExample {
    public static void main(String[] args) {
        DonutMenu menu = new DonutMenu();

        menu.showStaffMenu(); 	// 같은 패키지에 있으므로 접근 가능
    }
}