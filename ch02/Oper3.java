package ch02;

public class Oper3 {
	public static void main(String[] args) {
		int i1 = 1000000;
		int i2 = 2000000;
//				  int * int => int
//		long i3 = i1 * i2;
//				 long * long => long 결과도 long
		long i3 = (long) i1 * i2;
		System.out.println("i3 = " + i3);
	}

}
