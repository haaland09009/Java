package ch0217;

public class Test2 {
	public static void main(String[] args) {
		//1 + (1 + 2) + (1 + 2 + 3) + .... +(1 + ... + 10)
		//a*10 +2*9
		int sum = 0;
		for(int a=1; a<=10; a++) {
				int b = 11 - a;
				sum += a*b;


		}
		System.out.println(sum);
		
	}
}