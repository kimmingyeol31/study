package FightGame;

import java.util.Random;

public class Game {

	public static void main(String[] args) {
		Character player = new Character("나", 200, 15);
		Boss computer = new Boss("보스", 300, 20);
		Random r = new Random();
		
		while (true) {
			System.out.printf("%s의 남은체력: %d\n", player.name, player.hp);
			System.out.printf("%s의 남은체력: %d\n", computer.name, computer.hp);
			
			System.out.println();
			
			int playerAction = r.nextInt(2);
			
			if (playerAction == 0) {
				int playerATK = player.attack();
				System.out.printf("%s이(가) 공격했습니다. 입힌 피해: %dHP\n", player.name, playerATK);
				
				computer.hp -= playerATK;
			}
			else if (playerAction == 1) {
				player.defense();
			}
			
			
			int isSpecialAttack = r.nextInt(10);
			int computerATK;
			
			if (isSpecialAttack == 0 || isSpecialAttack == 1) {
				computerATK = computer.specialAttack();
				System.out.printf("%s이(가) 필살기를 날렸습니다. 입힌 피해: %dHP\n", computer.name, computerATK);
			}
			else {
				computerATK = computer.attack();
				System.out.printf("%s이(가) 공격했습니다. 입힌 피해: %dHP\n", computer.name, computerATK);
			}
			
			if (player.isDefenceState) {
				System.out.printf("%s이(가) 공격을 회피합니다.\n", player.name);
				player.isDefenceState = false;
			}
			else {
				player.hp -= computerATK;				
			}
			
			System.out.println();
			
			if (player.hp < 1 || computer.hp < 1) {
				break;
			}
		}
		
		
		if (player.hp < 0) {
			System.out.printf("%s이(가) 이겼습니다!", computer.name);
		}
		else {
			System.out.printf("%s이(가) 이겼습니다!", computer.name);
		}
	}

}
