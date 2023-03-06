package ch10;

import java.util.Scanner;

public class Assert1 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("점수를 입력하세요"); // run configuration 클릭
			num = sc.nextInt();
// Run configuration에 vm에 -eg를 입력하고 실행해야 한다
// 조건에 맞지 않으면 예외 발생
			assert(num <= 100 && num >= 0):  "잘못된 점수입니다"; // run configuration 클릭
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
