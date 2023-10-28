package homework;
import java.util.*;

public class Wizard {

	public static void main(String[] args) {
		Random r = new Random();
		
		int damage = r.nextInt(11) + 20;
		System.out.printf("마법사가 %d의 공격력으로 적을 공격했습니다", damage);
	}

}
