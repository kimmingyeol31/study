package homework;

import java.util.*;

public class ZombieGame {

	public static void main(String[] args) {
		int[] map = new int[20];
		int zombieAmount = 2;
		boolean isCatch = false;
		
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int[][] zombieMap = ZombieGame.reset(zombieAmount);
		int player = 0;
		
		while (true) {
			ZombieGame.erase();
			System.out.println("1(왼쪽), 2(오른쪽), 3(점프) 중 하나를 입력하세요.");
			ZombieGame.mapRender(player, zombieMap);
			if (isCatch == true) {
				System.out.print("좀비에게 잡혔습니다. 처음위치에서 다시 시작합니다.");
				isCatch = false;
			}
			
			int userInput = scanner.nextInt();
			
			switch (userInput) {
				case 1:
					player -= 1;
					break;
				case 2:
					player += 1;
					break;
				case 3:
					player += r.nextInt(3) + 1;
					break;
			}
			
			for (int[] zombie : zombieMap) {
				for (int i = 0; i < zombie.length; i++) {
					if (zombie[i] == 1) {
						int newZombiePosition = r.nextInt(i - 1, i + 2);
						
						if (newZombiePosition > 19) newZombiePosition = 19;
						else if (newZombiePosition < 0) newZombiePosition = 0;
						
						zombie[i] = 0;
						zombie[newZombiePosition] = 1;
						break;
					}
				}
			}
			
			if (player < 0) player = 0;
			
			System.out.print("\n");
			
			for (int[] zombie : zombieMap) {
				for (int i = 0; i < zombie.length; i++) {
					if (zombie[i] == 1 && player == i) {
						isCatch = true;
						player = 0;
						zombieMap = ZombieGame.reset(zombieAmount);
						break;
					}
				}
			}
			
			if (player >= 19) {
				ZombieGame.erase();
				ZombieGame.mapRender(player, zombieMap);
				System.out.print("미션 클리어!!! 목적지에 도착했습니다");
				break;
			}
		}
		scanner.close();
	}
	
	public static void mapRender(int player, int[][] zombieMap) {
		int[] map = new int[20];
		
		for (int i : map) {
			i = 0;
		}
		
		for (int[] zombie : zombieMap) {
			for (int i = 0; i < zombie.length; i++) {
				if (zombie[i] == 1) {
					map[i] = 2;
				}
			}
		}
		
		if (player >= 19) {
			map[19] = 1;	
		}
		else {
			map[player] = 1;
		}
		
		for (int i : map) {
			if (i == 0) {
				System.out.print("_");
			}
			else if (i == 1) {
				System.out.print("🧍");
			}
			else if (i == 2) {
				System.out.print("🧟");
			}
		}
		
		System.out.print("\n");
	}

	public static void erase() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}
	
	public static int[][] reset(int zombieAmount) {
		Random r = new Random();
		
		int[][] zombieMap = new int[zombieAmount][20];
		
		for (int[] zombie : zombieMap) {
			for (int i : zombie) {
				i = 0;
			}
			
			zombie[r.nextInt(1, zombie.length)] = 1;
		}
		
		return zombieMap;
	}
}
