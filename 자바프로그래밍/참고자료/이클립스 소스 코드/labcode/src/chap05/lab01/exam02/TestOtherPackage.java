package chap05.lab01.exam02;

import chap05.lab01.exam01.DonutMenu;  // chap05.lab01.exam01의 DonutMenu 가져오기

public class TestOtherPackage {
    public static void main(String[] args) {
        DonutMenu menu = new DonutMenu();   	// 오류 발생
        menu.showStaffMenu();             	
    }
}