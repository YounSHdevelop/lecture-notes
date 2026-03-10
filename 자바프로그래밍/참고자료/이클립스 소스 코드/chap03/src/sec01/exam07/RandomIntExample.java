package sec01.exam07;

public class RandomIntExample {
    public static void main(String[] args) {
        double randomValue = Math.random(); 		// 0.0 이상 1.0 미만의 무작위 수
        System.out.println("0.0-1.0미만의 무작위수: " + randomValue);

        int randomInt = (int) (Math.random() * 10);	// 0에서 9이하의 무작위 수
        System.out.println("0-9사이 무작위수: " + randomInt);

        randomInt = (int) (Math.random() * 10) + 1;	// 1에서 10이하의 무작위 수
        System.out.println("1-10사이 무작위수: " + randomInt); 
    }
}