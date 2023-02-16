package ch02;

public class Oper4 {
	public static void main(String[] args) {
		int i1 = 1000000, i2 = 2000000, i3 = 1000000;
//				  int * int 결과가 int 범위를 넘어서 문제 발생
//		long i4 = i1 * i2 / i3;
//		long i4 = i1 * (i2 / i3);
		long i4 = (long) i1 * i2 / i3;
		System.out.println("i4 = " + i4);
	}

}
