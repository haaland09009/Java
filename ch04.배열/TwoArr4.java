package ch04;

public class TwoArr4 {
	public static void main(String[] args) {
		int[][] k11 = {{23, 56},
					  {34, 78, 45},
					  {23, 99, 77, 64},
					  {27,66}};
		for(int[] k1 : k11) {
			for(int k : k1) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
