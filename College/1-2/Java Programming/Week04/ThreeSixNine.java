package homework;

import java.util.*;

public class ThreeSixNine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1부터 99 사이의 정수를 입력하세요.");
		int user = scanner.nextInt();
		
		scanner.close();
		
		int second = user / 10;
		int first = user % 10;
		int count = 0;
		
		if (first == 3 || first == 6 || first == 9) {
			count++;
		}
		
		if (second == 3 || second == 6 || second == 9) {
			count++;
		}
		
		
		if (count == 2) {
			System.out.print("박수짝짝");
		}
		else if (count == 1) {
			System.out.print("박수짝");
		}
		else {
			System.out.print("박수 없다...");
		}
	}

}
