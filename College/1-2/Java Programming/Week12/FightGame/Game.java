package FightGame;

import java.util.Random;

public class Game {

	public static void main(String[] args) {
		Character player = new Character("나", 200, 15);
		Character computer2 = new Character("좀비", 200, 5);
		Boss computer = new Boss("보스", 300, 20);
		Random r = new Random();
		
		while (true) {
			System.out.printf("%s의 남은체력: %d\n", player.name, player.getHp());
			System.out.printf("%s의 남은체력: %d\n", computer2.name, computer2.getHp());
			
			System.out.println();
			
			int playerAction = r.nextInt(2);
			
			if (playerAction == 0) {
				player.attack(computer2);
			}
			else if (playerAction == 1) {
				player.setDefenceState(true);
			}
			
			computer2.attack(player);
			
			if (player.getDefenceState()) {
				System.out.printf("%s이(가) 공격을 회피합니다.\n", player.name);
				player.setDefenceState(false);
			}
			
			System.out.println();
			
			int currentPlayerHp = player.getHp();
			int currentComputerHp = computer2.getHp();
			
			if (currentPlayerHp < 1) {
				System.out.printf("%s이(가) 이겼습니다!\n\n", computer2.name);
				break;
			}
			else if (currentComputerHp < 1) {
				System.out.printf("%s이(가) 이겼습니다!\n\n", player.name);
				break;
			}
		}
		
		if (player.getHp() < 1) return;
		
		while (true) {
			System.out.printf("%s의 남은체력: %d\n", player.name, player.getHp());
			System.out.printf("%s의 남은체력: %d\n", computer.name, computer.getHp());
			
			System.out.println();
			
			int playerAction = r.nextInt(2);
			
			if (playerAction == 0) {
				player.attack(computer);
			}
			else if (playerAction == 1) {
				player.setDefenceState(true);
			}
			
			
			int isSpecialAttack = r.nextInt(10);
			
			if (isSpecialAttack == 0 || isSpecialAttack == 1) {
				computer.specialAttack(player);
			}
			else {
				computer.attack(player);
			}
			
			if (player.getDefenceState()) {
				System.out.printf("%s이(가) 공격을 회피합니다.\n", player.name);
				player.setDefenceState(false);
			}
			
			System.out.println();
			
			int currentPlayerHp = player.getHp();
			int currentComputerHp = computer.getHp();
			
			if (currentPlayerHp < 1) {
				System.out.printf("%s이(가) 이겼습니다!", computer.name);
				break;
			}
			else if (currentComputerHp < 1) {
				System.out.printf("%s이(가) 이겼습니다!", player.name);
				break;
			}
		}
	}

}
