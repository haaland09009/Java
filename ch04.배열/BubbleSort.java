package ch04;

public class BubbleSort {
	public static void main(String[] args) {
		int[] score = {76,45,34,89,100,50,90,92};
		int temp = 0;
		for(int i = 0; i < score.length-1; i++) { // 두 개씩 묶어서 보기 때문에
			for(int j = 0; j < score.length-(i+1); j++) {
				if (score[j] > score[j+1]) {  // 뒤부터 완성
					temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
				
				
			}
		}
		for(int sc : score) {
			System.out.print(sc + " ");
		}
	}

}
