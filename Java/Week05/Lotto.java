package homework;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		Random r = new Random();
		
		int num1 = r.nextInt(45) + 1;
		int num2, num3, num4, num5, num6;
		
		do {
			num2 = r.nextInt(45) + 1;
		} while (num2 == num1);
		
		do {
			num3 = r.nextInt(45) + 1;
		} while (num3 == num1 || num3 == num2);
		
		do {
			num4 = r.nextInt(45) + 1;
		} while (num4 == num1 || num4 == num2 || num4 == num3);
		
		do {
			num5 = r.nextInt(45) + 1;
		} while (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4);
		
		do {
			num6 = r.nextInt(45) + 1;
		} while (num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5);
		
		System.out.printf("로또 당첨 번호: %d %d %d %d %d %d", num1, num2, num3, num4, num5, num6);
	}
}