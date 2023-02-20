package ch04;

public class SelectSort {
	public static void main(String[] args) {
		int[] score = {76,45,34,89,100,50,90,92};
//		데이터를 서로 바꾸려면 임시로 둘 공간을 확보해야함
		int temp = 0;
		for (int i = 0; i < score.length; i++) {
			for(int j = i+1; j < score.length; j++) {
				if (score[i] > score[j]) {
//			    if (score[i] < score[j])
 					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		for (int sc : score) {
			System.out.print(sc + " ");
		}
	
	
	}

}
