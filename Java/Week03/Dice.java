package homework;
import java.util.*;

public class Dice {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1부터 6사이의 숫자를 입력하세요 >> ");
		int user = scanner.nextInt();
		
		scanner.close();
		
		int computer = r.nextInt(6) + 1;
		
		System.out.printf("\n컴퓨터가 고른 숫자: %d\n", computer);
		
		if (user == computer) {
			System.out.println("주사위 숫자를 맞췄습니다.");
		}
		else {
			System.out.println("주사위 숫자를 틀렸습니다.");	
		}
	}

}
