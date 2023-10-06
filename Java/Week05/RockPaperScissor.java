package homework;

import java.util.*;

public class RockPaperScissor {

	public static void main(String[] args) {
		int computerWin = 0;
		int userWin = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. 게임을 중단하려면 중지(4)를 입력하세요.");
			int user = scanner.nextInt();
			
			if (user == 4) {
				break;
			}
			
			Random r = new Random();
			int computer = r.nextInt(3) + 1;

			// 컴퓨터가 가위(1)일때
			// 사용자가 가위(1)면 비김, 바위(2)면 이김, 보자기(3)면 
			if (computer == 1) {
				switch (user) {
					case 1:
						System.out.println("나: 가위, 컴퓨터: 가위, 비겼습니다.");
						break;
					case 2:
						System.out.println("나: 바위, 컴퓨터: 가위, 내가 이겼습니다.");
						userWin++;
						break;
					case 3:
						System.out.println("나: 보, 컴퓨터: 가위, 내가 졌습니다.");
						computerWin++;
						break;
				}
			}
			// 컴퓨터가 바위(2) 일때
			// 사용자가 가위(1)면 짐, 바위(2)면 비김, 보(3)면 이김
			else if (computer == 2) {
				switch (user) {
					case 1:
						System.out.println("나: 가위, 컴퓨터: 바위, 내가 졌습니다.");
						computerWin++;
						break;
					case 2:
						System.out.println("나: 바위, 컴퓨터: 바위, 비겼습니다.");
						break;
					case 3:
						System.out.println("나: 보, 컴퓨터: 바위, 내가 이겼습니다.");
						userWin++;
						break;
				}
			}
			// 컴퓨터가 보(3) 일때
			// 사용자가 가위(1)면 이김, 바위(2)면 짐, 보(3)면 비김
			else if (computer == 3) {
				switch (user) {
					case 1:
						System.out.println("나: 가위, 컴퓨터: 보, 내가 이겼습니다.");
						userWin++;
						break;
					case 2:
						System.out.println("나: 바위, 컴퓨터: 보, 내가 졌습니다.");
						computerWin++;
						break;
					case 3:
						System.out.println("나: 보, 컴퓨터: 보, 비겼습니다.");
						break;
				}
			}
			
			System.out.printf("%d승 %d패\n\n", userWin, computerWin);
		} while (computerWin < 3 && userWin < 3);
		
		scanner.close();
		
		if (computerWin == 3) {
			System.out.println("컴퓨터가 더 많이 이겼습니다!");
		}
		else if (userWin == 3) {
			System.out.println("당신이 더 많이 이겼습니다!");
		}
		else {
			System.out.println("게임을 종료합니다.");
		}
	}

}
