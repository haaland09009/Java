package ch04;

public class Amount1 {
	public static void main(String[] args) {
		
//		매출현황
//		제품명 1월 2월 3월 4월 합계 평균
//		------------------------------------------------------------------
//		냉장고 250 170 300 780
//		테레비 170 120 150 220
//		청소기 450 230 400 250
//		------------------------------------------------------------------
//		총계

		String subject = "매출현황";
		String[] title = {"제품명", "1월", "2월", "3월", "4월","합계", "평균"};
		String[] name = {"냉장고", "TV", "청소기"};
		int[][] amt = {{250, 170, 300, 780},
						{170, 120, 150, 220},
						{450, 230, 400, 250}};
		int len = 52, sum = 0;
		int[] tot = new int[amt[0].length];
		System.out.println(subject);
		System.out.println();
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < len; i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int i = 0; i < amt.length; i++) {  
			System.out.print(name[i] + "\t");
			for(int j = 0; j < amt[i].length; j++) { // 250
				System.out.print(amt[i][j] + "\t");
				sum += amt[i][j]; // 250 + 170 + 300 + 780
				tot[j] += amt[i][j]; // j가 조건에 해당할때만 적용 / tot0 250 tot1 170 tot2 tot2 300 tot3 780
			}
			System.out.println(sum + "\t" + sum/amt[i].length);
			sum = 0;
		}
		for(int i = 0; i < len; i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.print("합계\t");
		for(int j = 0; j < tot.length; j++) {
			System.out.print(tot[j] + "\t");
			sum += tot[j];
		}
		System.out.print(sum + "\t" + sum / tot.length / name.length);
	}
}
