package sec01.exam03;

class DonutPriceList {
    protected int netPrice = 900; 		// 본사와 지점만 공유하는 가격
    
    protected void showNetPrice() {
        System.out.println("도넛 공급가: " + netPrice + "원");
    }
}

public class ProtectedExample {
    public static void main(String[] args) {
        DonutPriceList priceList = new DonutPriceList();

        priceList.showNetPrice(); 	  // 같은 패키지에 있으므로 접근 가능
    }
}