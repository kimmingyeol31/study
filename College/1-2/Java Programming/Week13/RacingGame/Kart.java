package RacingGame;

public class Kart extends Car {

	Kart(String name, int maxSpeed) {
		super(name, maxSpeed);
	}

	@Override
	public void booster() {
		acceleration = maxSpeed;
		System.out.println("부스터 기능을 사용했습니다!");
	}
}
