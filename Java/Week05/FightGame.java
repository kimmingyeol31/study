package homework;

import java.util.*;

public class FightGame {

	public static void main(String[] args) {
		int Warrior = 20;
		int player = 10;
		
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("공격하려면 1을 누르세요.");
			int userInput = scanner.nextInt();
			
			if (userInput != 1) {
				scanner.close();
				System.out.println("종료합니다.");
				return;
			}
			
			int userDamage = r.nextInt(11) + 15;
			int WarriorDamage = r.nextInt(11) + 5;
			
			Warrior -= userDamage;
			player -= WarriorDamage;
			
			System.out.printf("마법사 HP : %d, 전사 HP : %d 입니다.\n", player, Warrior);
			
			if (Warrior < 1 && player < 1) {
				System.out.println("마법사와 전사가 동시에 죽었습니다.");
				break;
			}
			else if (Warrior < 1) {
				System.out.println("전사가 죽었습니다.");
				break;
			}
			else if (player < 1){
				System.out.println("마법사가 죽었습니다.");
				break;
			}
		} while (Warrior > 0 && player > 0);
		
		scanner.close();
	}

}
