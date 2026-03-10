package sec01.exam04;

class DonutRecipe {
    private String recipe = "밀가루 90g + 소금 1g"; // 레시피 노출 금지
    
    public void makeDonut() {
        System.out.println("도넛을 만듦-레시피 공개불가!");
    }
}

public class PrivateExample {
    public static void main(String[] args) {
        DonutRecipe d1 = new DonutRecipe();
        
        d1.makeDonut(); 

        // 외부에서는 private으로 선언된 recipe 직접 접근할 수 없음
        // System.out.println(d1.recipe); // 오류
    }
}