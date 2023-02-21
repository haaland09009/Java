package ch04;

import java.util.Scanner;

public class Ex04_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		System.out.println("4자리 연도를 입력하세요.");
		year = sc.nextInt();
		// &&가 ||보다 우선순위가 높다.
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) // and, or 중에서 and가 먼저임
			System.out.println(year +"년은 윤년입니다.");
		else {
			System.out.println(year +"년은 평년입니다.");
		}
		sc.close();
	}

}
