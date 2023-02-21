package ch0217;

import java.util.Scanner;

public class For8 {

	public static void main(String[] args) {
		//숫자를 받아서 해당하는 구구단 출력, 0을 입력하면 종료
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("구구단 숫자 입력");
			num = sc.nextInt(); //지역변수
			if(num>=2 && num<=9) {
				System.out.printf("구구단 %d단\n", num);
				for(int i=1; i<=9; i++) {
					System.out.printf("%d * %d = %d\n", num, i, num*i);
				}
			}
			
		}while(num != 0);
		System.out.println("프로그램 종료");
		/*int num = sc.nextInt();
		do {
			System.out.println("원하는 구구단 입력");
			int num = sc.nextInt();
			
		}while(num == 0);{
			System.out.println("프로그램 종료");
		}스캐너 반목때문에 막힘*/

		sc.close();
	}
}
