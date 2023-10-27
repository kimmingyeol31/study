package RacingGame;

import java.util.*;

public class Game {
	static int raceLen = 1000;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Car playerCar = new Car("포르쉐");
		Car computerCar = new Car("컴퓨터");
		
		int pedalCount = 0;
		
		System.out.println("자동차 게임을 시작합니다.");
		
		while (true) {
			System.out.println("1번-엑셀, 2번-브레이크, 3번-주행거리 표시");
			
			int playerInput = scanner.nextInt();
			
			if (playerInput == 1) {
				playerCar.pedal();
				pedalCount += 1;
			}
			else if (playerInput == 2) playerCar.speedDown();
			else if (playerInput == 3) playerCar.displayMilesage();
			else continue;
			
			computerCar.pedal();
			
			render(playerCar, computerCar); 
			
			int playerMileage = playerCar.mileage;
			int computerMileage = computerCar.mileage;
//			
//			System.out.print(playerMileage + "   " + computerMileage);
			
			if (playerMileage >= raceLen || computerMileage >= raceLen) {
				break;
			}
			
			System.out.println();
		}
		
		int playerMileage = playerCar.mileage;
		
		if (playerMileage >= raceLen) {
			System.out.println("내가 이겼습니다!");
			System.out.printf("내가 가속한 횟수는 %d번입니다.", pedalCount);
		}
		else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
		scanner.close();
	}

	
	public static void render(Car playerCar, Car computerCar) {
		int playerMileage = playerCar.mileage;
		int computerMileage = computerCar.mileage;
		
		double playerProgress = (double)playerMileage / raceLen;
		double computerProgress = (double)computerMileage / raceLen;
		
		int mapMax = 15;
		
		int playerCarPosition = (int) (playerProgress * mapMax);
		int computerCarPosition = (int) (computerProgress * mapMax);
		
		if (playerCarPosition < 0) playerCarPosition = 0;
		else if (playerCarPosition == (mapMax - 1) && playerCar.mileage < raceLen) playerCarPosition = mapMax - 2;
		else if (playerCarPosition > mapMax - 1) playerCarPosition = mapMax - 1;
		
		if (computerCarPosition < 0) computerCarPosition = 0;
		else if (playerCarPosition == (mapMax - 1) && computerCar.mileage < raceLen) computerCarPosition = mapMax - 2;
		else if (computerCarPosition > mapMax - 1) computerCarPosition = mapMax - 1;
		
		System.out.printf("%s  ", playerCar.name);
		for (int i = 0; i < mapMax; i++) {
			if (i == playerCarPosition) {
				System.out.print("🚓");
			}
			else {
				System.out.print("_");
			}
		}
		
		System.out.println();
		System.out.printf("%s  ", computerCar.name);
		
		for (int i = 0; i < mapMax; i++) {
			
			if (i == computerCarPosition) {
				System.out.print("🚓");
			}
			else {
				System.out.print("_");
			}
		}
		
		System.out.println();
	}
}
