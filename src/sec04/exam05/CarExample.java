package sec04.exam05;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		
		myCar.run();
		
		int speed = myCar.getSpeed();
		System.out.printf("현재 속도 : %dkm/h", speed);
	}
}
