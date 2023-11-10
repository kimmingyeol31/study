package ZombieGame;

import java.util.*;

public class Game {
	static int map = 20;
	static int zombieAmount = 2;
	static Zombie[] zombies = new Zombie[zombieAmount];
	static Hero player;
	
	static Random r = new Random();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		init(3);
		
		while (true) {
			System.out.println("1번 - 왼쪽, 2번 - 오른쪽, 3번 - 점프");
			int playerInput = scanner.nextInt();
			
			if (playerInput == 1) {
				player.leftMove();
			}
			else if (playerInput == 2) {
				player.rightMove();
			}
			else if (playerInput == 3) {
				player.jump();
			}
			else {
				continue;
			}
			
			for (Zombie zombie : zombies) {
				zombie.move();
			}
			
			System.out.println();
			
			for (Zombie zombie: zombies) {
				if (zombie.position == player.position) {
					System.out.print("좀비에게 잡혔습니다! ");
					
					player.hp -= 1;
					
					if (player.hp > 0) {
						System.out.printf("현재 나의 생명이 %d개 남았습니다.\n", player.hp);
						System.out.print("처음 위치에서 다시 시작합니다.\n");
						
						init(player.hp);
						
						continue;
					}
					else {
						System.out.print("생명이 0입니다. 게임을 종료합니다.\n");
						break;
					}
				}
			}
			
			if (player.position >= map) {
				System.out.print("미션 클리어!!! 목적지에 도착했습니다.");
				break;
			}
			
			System.out.println();
		}
		
		scanner.close();
	}
	
	public static void init(int leftHp) {
		for (int i = 0; i < zombieAmount; i++) {
			zombies[i] = new Zombie("좀비" + (i + 1), r.nextInt(2, map), map);
		}
		
		player = new Hero("주인공", 1, leftHp, map);
	}

	public static void render() {
		
	}
	
}