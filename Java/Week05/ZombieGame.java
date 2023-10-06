package homework;

import java.util.*;

public class ZombieGame {

	public static void main(String[] args) {
		int player = 1;
		int zombie1 = 7, zombie2 = 15;
	
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		
		while (true) {
			ZombieGame.Erase();
			System.out.println("1부터 3 사이의 숫자를 입력하세요.");
			
			String g = ZombieGame.Render(player, zombie1, zombie2);
			System.out.printf(g + "\n\n");
			
//			System.out.printf("현재 위치는 %d 입니다.\n", player);
//			System.out.printf("좀비1 위치: %d, 좀비2 위치: %d\n\n", zombie1, zombie2);
			
			int userInput = scanner.nextInt();
			
			switch (userInput) {
				case 1:
					System.out.print("왼쪽으로 움직였습니다.\n");
					player -= 1;
					break;
				case 2:
					System.out.print("오른쪽으로 움직였습니다.\n");
					player += 1;
					break;
				case 3:
					System.out.print("점프했습니다.\n");
					
					player += r.nextInt(3) + 1;
					break;
			}
			
			if (r.nextBoolean()) zombie1++;
			else zombie1--;
			
			if (r.nextBoolean()) zombie2++;
			else zombie2--;
			
			if (player < 1) player = 1;
			
			if (zombie1 < 1) zombie1 = 1;
			else if (zombie1 > 20) zombie1 = 20;
			
			if (zombie2 < 1) zombie2 = 1;
			else if (zombie2 > 20) zombie2 = 20;
			
			System.out.print("\n");
			
			if (player == zombie1 || player == zombie2) {
				System.out.println("좀비에게 잡혔습니다. 처음위치에서 다시 시작합니다.\n");
				
				player = 1;
				zombie1 = 7;
				zombie2 = 15;
				
				continue;
			}
			
			if (player >= 20) {
				System.out.println("미션 클리어!!! 목적지에 도착했습니다");
				break;
			}
		}
		scanner.close();
	}
	
	public static String Render(int player, int zombie1, int zombie2) {
		String g = "";
		
		for (int i = 1; i <= 20; i++) {
			if (player == i) {
				g += "⛹️";
				continue;
			}
			else if (zombie1 == i) {
				g += "🧟‍♂️";
				continue;
			}
			else if (zombie2 == i) {
				g += "🧟‍♂️";
				continue;
			}
			else {
				g += "◼️";
			}
		}
		
		return g;
	}

	public static void Erase() {
		for (int i = 1; i == 20; i++) {
			System.out.println();
		}
	}
}
