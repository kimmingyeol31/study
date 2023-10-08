package homework;

import java.util.*;

public class FightGame {

	public static void main(String[] args) {
		int Warrior = 20;
		int player = 10;
		
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("공격하려면 1을 누르세요.");
		int userInput = scanner.nextInt();
		
		scanner.close();
		
		if (userInput != 1) {
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
		}
		else if (Warrior < 1) {
			System.out.println("전사가 죽었습니다.");
		}
		else if (player < 1){
			System.out.println("마법사가 죽었습니다.");
		}
		else {
			System.out.println("아무도 죽지 않았습니다.");
		}
	}

}
