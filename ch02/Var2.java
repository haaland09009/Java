package ch02;

public class Var2 {
	public static void main(String[] args) {
		
//		정수 34를 byte b1, int i1형에 대입하고 출력
//		int i2 = 456에 대입하고 i1과 i2를 서로 + - * / 연산 수행

		int i1 = 34, i2 = 456; // 데이터형이 같을 때는 묶어서 사용 가능하다.
		byte b1 = 34;
		System.out.println(i1);
		System.out.println(b1);
		
		System.out.printf("%d + %d = %d\n", i1, i2, i1 + i2);
		System.out.printf("%d - %d = %d\n", i1, i2, i1 - i2);
		System.out.printf("%d * %d = %d\n", i1, i2, i1 * i2);
		System.out.printf("%d / %d = %d\n", i2, i1, i2 / i1);

	}
}
