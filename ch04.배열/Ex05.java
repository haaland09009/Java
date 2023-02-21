package ch04;

public class Ex05 {
	public static void main(String[] args) {
//		행별로 최댓값, 최솟값, 합계 출력하고, 전체 합계, 전체 최대, 전체 최소 출력하기
		int[][] score = {{67,78,98},{78,98,65},{78,56,90}};
		int sum = 0, tot = 0, max = 0, min= 100, tmax = 0, tmin = 100;
		// sum : 행별합계, tot: 전체 합계, tmax: 전체 최대, tmin: 전체 최소
		System.out.println("국어\t영어\t수학\t합계\t최대\t최소");
		System.out.println("=============================================");
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
				tot += score[i][j];
				if (max < score[i][j]) max = score[i][j];
				if (min > score[i][j]) min = score[i][j];
				if (tmax < score[i][j]) tmax = score[i][j];
				if (tmin > score[i][j]) tmin = score[i][j];
				
			}
			System.out.println(sum + "\t" + max + "\t" + min);
			sum = 0; max = 0; min = 100; // 행 끝날 때마다 업데이트
		
		}
		System.out.println("=============================================");
		System.out.println("총계 : " + tot +", 전체 최대:  "+tmax +", 전체 최소: " + tmin);
	
	}
}
