package RacingGame;

import java.util.*;

public class Car {
	String name;
	int maxSpeed = 100;
	int acceleration = 0;
	int mileage = 0;
	
	public Car(String name) {
		this.name = name;
	}
	
	public void displayMilesage() {
		System.out.printf("%s의 주행 거리는 %dkm/h입니다.", name, mileage);
	}
	
	public void pedal() {
		Random r = new Random();
		acceleration += r.nextInt(10, 21);
		
		if (r.nextInt(1, 11) == 1) {
			System.out.printf("앗! %s가 바나나를 밟았습니다.\n", name);
			acceleration = 0;
		}
		
		if (acceleration > maxSpeed) acceleration = maxSpeed;
		
		mileage += acceleration;
		
		System.out.printf("%s의 현재 속도는 %dkm/h입니다.\n", name, acceleration);
	}
	
	public void speedDown() {
		acceleration -= 10;
		if (acceleration < 0) acceleration = 0;
		
		mileage += acceleration;
		
		System.out.printf("%s의 현재 속도는 %dkm/h입니다.\n", name, acceleration);
	}
}
