package homework;
import java.util.*;

public class Profile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = scanner.next();
		
		System.out.print("나이를 입력하세요: ");
		int age = scanner.nextInt();
		
		System.out.print("생년월일(8자리)를 입력하세요: ");
		long birthDate = scanner.nextLong();
		
		System.out.print("키를 입력하세요: ");
		double height = scanner.nextDouble();
		
		System.out.print("취미를 입력하세요: ");
		String hobby = scanner.next();
		
		scanner.close();
		
		System.out.printf("당신이 입력한 내용은 이름은 %s, 나이는 %d, 생년월일은 %d, 키는 %f, 취미는 %s입니다.", name, age, birthDate, height, hobby);
	}

}
