package ch0217;

import java.io.IOException;

public class Do4 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("보고 싶은 구구단은?");
		int num = System.in.read()-'0';
		System.out.println("구구단" + num + "단");
		
		int i = 1;
		do {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
			i++;
		}while(i<=9);
		
		//do - while을 이용하여 입력된 구구단 출력
		/* a = 1, b = 1;
		do {
			System.in.read();
			System.out.printf("%d * %d = %d\n", a, b, a*b);
			b++;
		}while(a<=9);{
			a++;

			
		}*/
	}
}
