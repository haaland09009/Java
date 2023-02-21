package ch0217;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		int num = 0;
		do {
			System.out.println("정수 입력");
			//num = sc.nextInt();정수가 까지 일고 엔터 무시해서 문자열 출력 안됌
			num = Integer.parseInt/*입력한 문자열을 정수로 변경*/(sc.nextLine());
			System.out.println("입력한 정수 : " + num);
			System.out.println("문자열 입력");
			str = sc.nextLine();
			System.out.println("입력한 문자 : " + str);
			if(str.equals("x")) break;
		}while(true);
		System.out.println("프로그램 종료");
		sc.close();
	}
}
