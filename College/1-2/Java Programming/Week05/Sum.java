package homework;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while (i<=100) {
			sum += i;
			i++;
		}
		
		System.out.printf("1-100까지의 합은: %d", sum);
	}

}
