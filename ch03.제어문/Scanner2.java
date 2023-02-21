package ch0217;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("정수를 입력");
			num = sc.nextInt(); //정수까지 일고 엔터는 무시
			System.out.println("입력한 정수 : " + num);
		}while(num != 0);
		System.out.println("프고르램 종료");
		sc.close();
	}
}
