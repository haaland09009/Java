package ch0217;

import java.io.IOException;

public class Do6 {

	public static void main(String[] args) throws IOException {
		
		int num = 0, i = 1;
		do {
			System.out.println("보고 싶은 구구단");
			num = System.in.read()-'0';
			System.in.read(); //CR엔터 처리
			System.in.read();//LF 엔터 처리
			if(num>=2 && num<=9) {
				do {
					System.out.printf("%d * %d = %d\n", num, i, num*i);
					i++;
				}while(i<=9);
			}else System.out.println("구구단 번호가 아님");
			i = 1;
		}while(num != 0);System.out.println("종료한다");//0이면 종료
	}
}
