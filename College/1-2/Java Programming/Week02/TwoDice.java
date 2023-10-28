package homework;
import java.util.*;

public class TwoDice {

	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random();
		
		int diceResult1 = r1.nextInt(6) + 1;
		int diceResult2 = r2.nextInt(6) + 1;
		
		int sum = diceResult1 + diceResult2;
		
		System.out.println(sum);
	}

}
