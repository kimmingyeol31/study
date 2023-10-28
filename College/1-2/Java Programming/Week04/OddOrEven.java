package homework;

import java.util.*;

public class OddOrEven {

	public static void main(String[] args) {
		Random dice = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("홀짝 주사위 게임을 시작합니다.");
		System.out.println("홀수(1) 또는 짝수 (2)를 선택하세요.");
		int user = scanner.nextInt();
		
		scanner.close();
		
		System.out.println("주사위를 던집니다...");
		int computer = dice.nextInt(6) + 1;
		
		System.out.println(computer % 2 == 0);
		
		if (computer % 2 == 0) {
			System.out.println("짝수입니다.");
			
			if (user == 2) {
				System.out.println("사용자가 이겼습니다.");
			}
			else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
		}
		else {
			System.out.println("홀수입니다.");
			
			if (user == 1) {
				System.out.println("사용자가 이겼습니다.");
			}
			else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
		}
	}

}
