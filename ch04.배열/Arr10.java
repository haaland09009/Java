package ch04;

public class Arr10 {
	public static void main(String[] args) {
		int[] score = {76,45,34,89,100,50,90,92};
		int sum = 0, max = score[0], min = score[0];

			
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i]) max = score[i];
			if (min > score[i]) min = score[i];
		}
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum / score.length);
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
		
		System.out.println();
		int[] score2 = {76,45,34,89,98,50,90,92,77,25};
		int sum2 = 0, max2 = score2[0], min2 = score2[0];
		
		for (int s : score2) {
			sum2 += s;
			if (max2 < s) max2 = s;
			if (min2 > s) min2 = s;
		}
		System.out.println("합계: " + sum2);
		System.out.println("평균: " + sum2 / score2.length);
		System.out.println("최댓값: " + max2);
		System.out.println("최솟값: " + min2);		
		

		
	}
}
