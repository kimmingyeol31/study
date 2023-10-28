package homework;

import java.util.*;

public class Draw {

	public static void main(String[] args) {
		Random r = new Random();
		
		int num1 = r.nextInt(100) + 1;
		int num2, num3;
		
		do {
			num2 = r.nextInt(100) + 1;
		} while (num2 == num1);
		
		do {
			num3 = r.nextInt(100) + 1;
		} while (num3 == num1 || num3 == num2);
		
		System.out.printf("1번: %d, 2번: %d, 3번: %d", num1, num2, num3);
	}
}