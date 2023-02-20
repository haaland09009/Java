package ch04;

public class TwoArr3 {
	public static void main(String[] args) {
		int[][] score = {{88,99,88,77},
						{56,88,76,92},
						{92,87,90,82}};
		int sum = 0;
		System.out.println("국어\t영어\t수학\t과학\t합계\t평균");
		System.out.println("-------------------------------------------");
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			System.out.println(sum + "\t" + sum / score[i].length);
			sum = 0;
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println("국어\t영어\t수학\t과학\t합계\t평균");
		System.out.println("-------------------------------------------");
		for(int[] scor : score) {
			for(int sc : scor) {
				System.out.print(sc + "\t");
				sum += sc;
			}  
			System.out.println(sum + "\t" + sum / scor.length);
			sum = 0;
		}
		
		
		
	}

}
