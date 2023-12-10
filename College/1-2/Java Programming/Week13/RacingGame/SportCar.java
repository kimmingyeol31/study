package RacingGame;

public class SportCar extends Car {
	SportCar (String name, int maxSpeed) {
		super(name, maxSpeed);
	}
	
	public void booster() {
		acceleration *= 2;
		
		if (acceleration > maxSpeed) {
			acceleration = maxSpeed;
		}
		
		System.out.println("부스터 기능을 사용했습니다!");
	}
}
