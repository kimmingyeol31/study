package homework;

import java.util.*;

public class Street {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] map = {
				{0,0,1,1,1},
				{1,0,0,1,1},
				{1,1,0,0,1},
				{1,1,1,0,1},
				{1,1,1,0,0}
		};
		
		int userXPosition = 0, userYPosition = 0;
		int moveCount = 0;
		
		render(userXPosition, userYPosition, map);
		
		while (true) {
			int userInput = scanner.nextInt();
			
			if (userInput == 8) {
				userYPosition -= 1;
			}
			else if (userInput == 2) {
				userYPosition += 1;
			}
			else if (userInput == 6) {
				userXPosition += 1;
			}
			else if (userInput == 4) {
				userXPosition -= 1;
			}
			else {
				continue;
			}
			
			if (userXPosition < 0) {
				userXPosition = 0;
				moveCount -= 1;
			}
			if (userYPosition < 0) {
				userYPosition = 0;
				moveCount -= 1;
			}
			
			if (map[userYPosition][userXPosition] == 1) {
				if (userInput == 8) {
					userYPosition += 1;
				}
				else if (userInput == 2) {
					userYPosition -= 1;
				}
				else if (userInput == 6) {
					userXPosition -= 1;
				}
				else if (userInput == 4) {
					userXPosition += 1;
				}
			}
			else {
				moveCount += 1;
			}
			
			Street.erase();
			Street.render(userXPosition, userYPosition, map);
			
			if (userXPosition == 4 & userYPosition == 4) {
				break;
			}
		}
		
		scanner.close();
		System.out.printf("%d번 만에 도착했습니다.", moveCount);
	}

	
	public static void render(int userXPosition, int userYPosition, int[][] map) {
		map[userYPosition][userXPosition] = 2;
		
		for (int i = 0; i < 5; i++) {
			for (int j : map[i]) {
				if (j == 0) {
					System.out.print("⬜");
				}
				else if(j == 1) {
					System.out.print("🌳");
				}
				else if (j == 2) {
					System.out.print("🔘");
				}
			}
			System.out.println();
		}
		map[userYPosition][userXPosition] = 0;
	}
	
	public static void erase() {
		for (int i = 0; i < 25; i ++) {
			System.out.println();
		}
	}
}
