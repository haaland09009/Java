package ch04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// Scanner를 이용하여 4자리 정수를 받고 year
		// 윤년 (400으로 나누어서 떨어지면 윤년임 ex) 2000년 ,    4로 나누어서 떨어지고 100으로 나누어서 안 떨어지면 윤년)또는 평년으로 출력
		Scanner sc = new Scanner(System.in);
		int year = 0;
		do {
			System.out.println("4자리 연도를 입력하세요.");
			year = sc.nextInt();
			if (year == 0)
				break;				
			else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 
				System.out.println(year +"년은 윤년입니다.");
			else 
				System.out.println(year +"년은 평년입니다.");
		} while (true);
		System.out.println("프로그램 종료");
		sc.close();
	}

}
