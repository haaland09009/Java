package ch04;

public class Ex02 {
	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5}, 
						{10, 10, 10, 10, 10},
						{20, 20, 20, 20, 20}, 
						{30, 30, 30, 30, 30}};
		int sum = 0; // 행별 합계
		int tot = 0; // 총 합계

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				tot += arr[i][j];
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("합계: " + sum);
			sum = 0;
		} System.out.println("총 합계: " + tot);
		
	}

}
