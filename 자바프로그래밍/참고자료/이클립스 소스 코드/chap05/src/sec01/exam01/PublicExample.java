package sec01.exam01;

import sec01.exam01.DonutShop;   // 같은 패키지에 있음으로 import 없이도 작동함

public class PublicExample {
    public static void main(String[] args) {
        DonutShop shop = new DonutShop(); 
        System.out.println(shop.shopName);   	// 다른 패키지에서도 접근 가능
        shop.openShop();                       	// 다른 패키지에서도 호출 가능
    }
}