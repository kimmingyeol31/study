package homework;

import java.util.*;

public class ZombieGame {

	public static void main(String[] args) {
		int player = 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1부터 3 사이의 숫자를 입력하세요");
		int userInput = scanner.nextInt();
		
		scanner.close();
		
		switch (userInput) {
			case 1:
				System.out.print("왼쪽으로 움직였습니다.");
				player -= 1;
				break;
			case 2:
				System.out.print("오른쪽으로 움직였습니다.");
				player += 1;
				break;
			case 3:
				System.out.print("점프했습니다.");
				
				Random r = new Random();
				player += r.nextInt(3) + 1;
				break;
		}
		
		System.out.printf("현재 위치는 %d 입니다.", player);
	}

}
