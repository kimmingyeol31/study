package RacingGame;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Car playerCar = new Kart("소나타", 100);
		Car computerCar = new SportCar("컴퓨터", 100);
		Scanner scanner = new Scanner(System.in);
		
		int track = 500;
		int accelerationCount = 0;
		
		while (true) {
			System.out.println("1번-엑셀, 2번-브레이크, 3번-주행거리 표시");
			int userInput = scanner.nextInt();
			
			if (userInput == 1) {
				System.out.println("페달을 밟았습니다.");
				
				playerCar.speedUp();
				accelerationCount++;	
			}
			else if (userInput == 2) {
				System.out.println("브레이크를 밟았습니다.");
				
				playerCar.brake();
			}
			else if (userInput == 3) {
				playerCar.displayMile();
			}
			else {
				continue;
			}
			
			System.out.println();
			
			System.out.println("컴퓨터가 페달을 밟았습니다.");
			computerCar.speedUp();
			
			System.out.println();
			
			System.out.printf("%s의 현재 속도: %d\n", playerCar.name, playerCar.acceleration);
			System.out.printf("%s의 현재 속도: %d\n", computerCar.name, computerCar.acceleration);
			
			System.out.println();
			
			if (playerCar.mile > track || computerCar.mile > track) {
				break;
			}
		}
		
		scanner.close();
		
		if (playerCar.mile > track) {
			System.out.println("내가 이겼습니다!");
			System.out.printf("페달을 %d번 밟았습니다.", accelerationCount);
		}
		else {
			System.out.print("컴퓨터가 이겼습니다...");
		}
		
	}

}