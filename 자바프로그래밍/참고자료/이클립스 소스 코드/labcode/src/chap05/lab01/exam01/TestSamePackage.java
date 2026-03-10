package chap05.lab01.exam01;

public class TestSamePackage {
    public static void main(String[] args) {
        DonutMenu menu = new DonutMenu();      // 같은 패키지라서 접근 가능
        menu.showStaffMenu();                 
    }
}