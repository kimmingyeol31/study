package homework;
import java.util.*;

public class Gugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자(정수)를 입력하세요 >> ");
		int x = scanner.nextInt();
		
		System.out.print("두번째 숫자(정수)를 입력하세요 >> ");
		int y = scanner.nextInt();
		
		scanner.close();
		
		System.out.printf("%d x %d의 결과는 %d입니다.", x, y , x * y);
	}

}
