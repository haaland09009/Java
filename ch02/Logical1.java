package ch02;

public class Logical1 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 7;
//		== 같다, != 같지 않다, >, >=, <, <=
		boolean b1 = i1>i2, b2 = i1>=i2, b3 = i1==i2, b4 = i1!=i2, b5 = i1<i2, b6 = i1<=i2;
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		System.out.println("b5 = " + b5);
		System.out.println("b6 = " + b6);
		
	}

}
