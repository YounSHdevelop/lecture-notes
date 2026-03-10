package chap05.lab02;

class Car {
    String carNumber;
    
    static int totalCars = 0;     // 전체 등록된 차량 수(클래스 변수)

    Car(String carNumber) {
        this.carNumber = carNumber;
        totalCars++; 		      // 새로운 차량이 들어올 때마다 전체 수 증가
        System.out.println(carNumber + " 차량이 입차 되었습니다.");
    }

    void exit() {
    	totalCars--; 		      // 차량이 나가면 전체 수 감소
        System.out.println(carNumber + " 차량이 출차 되었습니다.");
    }

    
    static void showTotalCars() {
        System.out.println("현재 주차장에 있는 차량 수: " + totalCars);
    }
}

public class ParkingLotExample {
    public static void main(String[] args) {

        Car car1 = new Car("12가 3456");
        Car car2 = new Car("34나 7890");
        
        car1.exit(); 			// 1대 출차
        Car.showTotalCars(); 	// 현재 주차장에 있는 차량 수
    }
}