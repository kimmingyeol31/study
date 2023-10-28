package homework;

import java.util.*;

public class Score {

	public static void main(String[] args) {
		int[] scores = new int[3];
		String[] korean = { "국어", "수학", "영어" };
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s 점수를 입력하세요:\n", korean[i]);
			int inputScore = scanner.nextInt();
			
			scores[i] = inputScore;
		}
		
		int scoreSum = 0;
		
		for (int i : scores) {
			scoreSum += i;
		}
		
		double scoreAverage = scoreSum / 3;
		
		System.out.printf("총 점수: %d점, 평균 점수: %f점", scoreSum, scoreAverage);
		
		scanner.close();
	}

}
