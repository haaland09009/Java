package ch0217;

public class Test01 {
	public static void main(String[] args) {
		//1부터 20까지 정수 중에서 2또는 3의 배수가 아닌 수의 합
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				sum += 1;
			}
		}
		System.out.println("합 : " + sum);		
		/*int a = 0, b = 0, c = 0;
		
		int sum = 0, sum1 = 0, sum2 = 0;
		for(int a=1; a<=20; a++) {
			sum += a;
			for(int b=1; b<=20; b=b+2) {
				sum1 += b;
				
			}
		}나 너무 못하는데? 이상하네;;;;;;*/
	}
}