package homework;

import java.util.*;

public class Football {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int round = 1;
		int playerWon = 0, computerWon = 0;
		
		System.out.println("축구 게임을 시작합니다.");
		
		while (true) {
			int keeper = random.nextInt(1, 4);
			String action = "";
			
			if (keeper == 1) {
				action = "왼쪽";
			}
			else if (keeper == 2) {
				action = "가운데쪽";
			}
			else if (keeper == 3) {
				action = "오른쪽";
			}
			
			if (round % 2 == 1) {
				System.out.println("내가 공을 찰 차례입니다.\n(왼쪽-1, 가운데-2, 오른쪽-3, 게임 끝-4)");
				int userInput = scanner.nextInt();
				
				if (userInput == 1) {
					System.out.println("왼쪽으로 공을 찼습니다.");
				}
				else if (userInput == 2) {
					System.out.println("가운데쪽으로 공을 찼습니다.");
				}
				else if (userInput == 3) {
					System.out.println("오른쪽으로 공을 찼습니다.");
				}
				else if (userInput == 4) {
					break;
				}
				
				System.out.printf("골키퍼가 %s으로 움직입니다.\n\n", action);
				
				if (keeper != userInput) {
					System.out.println("골인입니다.");
					playerWon++;
				}
				else {
					System.out.println("아깝습니다.!!! 골키퍼가 골을 막았습니다.");
				}
			}
			else {
				System.out.println("내가 공을 막을 차례입니다.\n(왼쪽-1, 가운데-2, 오른쪽-3, 게임 끝-4)");
				int userInput = scanner.nextInt();
				
				if (userInput == 1) {
					System.out.println("왼쪽으로 공을 막을겁니다.");
				}
				else if (userInput == 2) {
					System.out.println("가운데쪽으로 공을 막을겁니다.");
				}
				else if (userInput == 3) {
					System.out.println("오른쪽으로 공을 막을겁니다.");
				}
				else if (userInput == 4) {
					break;
				}
				
				System.out.printf("공이 %s으로 날아옵니다.\n\n", action);
				
				if (keeper == userInput) {
					System.out.println("공을 막았습니다.");
				}
				else {
					System.out.println("아깝습니다.!!! 골을 먹혔습니다.");
					computerWon += 1;
				}
			}
			
			if (computerWon != playerWon && round >= 10) {
				break;
			}
			else if (computerWon == playerWon && round >= 10) {
				System.out.print("동점입니다. 1번씩 공을 더 차서 승부를 결정합니다.");
			}
			
			round += 1;	
		}
		
		System.out.printf("나는 %d골, 컴퓨터는 %d골을 넣어 ", playerWon, computerWon);
		
		if (playerWon > computerWon) {
			System.out.println("내가 이겼습니다.");
		}
		else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
		scanner.close();
		System.out.print("게임을 종료합니다.");
	}
}
