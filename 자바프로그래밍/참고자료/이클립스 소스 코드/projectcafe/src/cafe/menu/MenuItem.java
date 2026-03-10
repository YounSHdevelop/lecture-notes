package cafe.menu;

// 모든 메뉴 항목이 가져야 할 공통 기능을 정의하는 인터페이스
public interface MenuItem {

     // 메뉴 항목의 이름을 반환
    public String getName();

     // 메뉴 항목의 가격을 반환
    public int getPrice();
}