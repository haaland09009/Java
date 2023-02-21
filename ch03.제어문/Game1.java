package ch0217;

import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ran = (int)(Math.random() * 100) + 1;
		
		int num = 0, cnt = 0;
		do {
			System.out.println("숫자를 맞춰 보자");
			num = sc.nextInt();
			if(num>ran) System.out.println("작은 수를 입력해라");
			else if(num<ran) System.out.println("큰 수를 입력해라");
			cnt++;
		}while(ran != num);
		System.out.printf("%d번에 숫자 %d를 맞췄다.", cnt, ran);
		sc.close();
	}
}
