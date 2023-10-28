package homework;
import java.util.*;

public class KRWToUSD {

	public static void main(String[] args) {
		System.out.print("원화를 입력하세요(단위: 원) >> ");
		Scanner scanner = new Scanner(System.in);
		
		int KRW = scanner.nextInt();
		double USD = KRW / 1100.0;

		scanner.close();
		
		System.out.printf("%d원은 $%f입니다.", KRW, USD);
	}

}
