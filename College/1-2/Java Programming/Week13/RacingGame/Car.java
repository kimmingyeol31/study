package RacingGame;

import java.util.*;

public abstract class Car {
	String name;
	int maxSpeed;
	int acceleration;
	int mile;
	
	Random r = new Random();
	
	Car (String name, int maxSpeed) {
		this.name = name;
		this.maxSpeed = maxSpeed;
	}
	
	public void speedUp() {
		acceleration += r.nextInt(10, 21);
		
		if (acceleration > maxSpeed) {
			acceleration = maxSpeed;
		}
		
		
		int isCrashed = r.nextInt(1, 11);
		if (isCrashed == 1) {
			System.out.printf("이런! %s가 바나나를 밟았습니다.\n", name);
			
			acceleration = 0;
		}
		
		mile += acceleration;
	}
	
	public void brake() {
		acceleration -= 10;
		
		if (acceleration < 0) {
			acceleration = 0;
		}
	}
	
	public void displayMile() {
		System.out.printf("%s의 주행거리: %d\n", name, mile);
	}
	
	public abstract void booster();
}
