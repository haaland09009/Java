package ch0217;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원하는 구구단");
		int num = sc.nextInt();
		System.out.println("구구단 " + num + "단");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		/*int num = sc.nextInt();
		
		int a = 0, b = 0;
		for(int a = 1; a<=9; a++) {
			for(int b = 1; b<=9; b++) {
				
			}
		}*/
		sc.close();
	}
}
