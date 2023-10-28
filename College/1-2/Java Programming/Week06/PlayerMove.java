package homework;

import java.util.*;

public class PlayerMove {

	public static void main(String[] args) {
		int[] map = new int[30];
		
		for (int i = 0; i < map.length; i++) {
			map[i] = 0;
		}
		
		map[0] = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("1 또는 2를 입력하세요.");
			int playerInput = scanner.nextInt();
			
			int playerMove;
			
			if (playerInput == 1) {
				playerMove = -1;
			}
			else if (playerInput == 2) {
				playerMove = 1;
			}
			else {
				System.out.println("잘못된 입력 값입니다.");
				continue;
			}
			
			if (playerMove == -1 && map[0] == 1) {
				PlayerMove.mapPrint(map);
				System.out.println("\n");
				continue;
			}
			
			if (playerMove == 1 && map[28] == 1) {
				PlayerMove.mapPrint(map);
				System.out.println("\n목적지에 도착했습니다.");
				break;
			}
			
			for (int i = 0; i < map.length; i++) {
				if (map[i] == 1) {
					map[i + playerMove] = 1;
					map[i] = 0;
					
					break;
				}
			}

			PlayerMove.mapPrint(map);
			System.out.println("\n");
		}
		
		scanner.close();
	}

	public static void mapPrint(int[] map) {
		for (int i : map) {
			System.out.print(i);
		}
	}
}
