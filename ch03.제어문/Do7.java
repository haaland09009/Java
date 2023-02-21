package ch0217;

public class Do7 {

	public static void main(String[] args){
		
		int i = 1, j = 2;
		System.out.println("구구단 시작");
		do {
			do {
				System.out.printf("%d * %d = %d\t",j, i, j*i);
				j++;
			}while(j<=9);
			System.out.println();
			i++;
			j = 2;
		}while(i<=9);
		
		/*
		 * int num = 1, i = 1;

		System.out.println("구구단 시작");
		while(num<=9) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			num++;
			do {
				i++;
			
		}while(i<=9);
		}
		*/
	}
}
