package ch0217;

public class For3 {

	public static void main(String[] args) {
		//1 ~ 100 사이 짝수합, 홀수합
		int evenSum = 0, oddSum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) evenSum += i;
			else oddSum +=i;
		}
		System.out.println("짝수의 합계 : " + evenSum);
		System.out.println("홀수의 합계 : " + oddSum);
		System.out.println("전체의 합계 : " + (evenSum + oddSum));
	}
}
