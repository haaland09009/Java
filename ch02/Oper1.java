package ch02;

public class Oper1 {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = (char) (c1+1);
		int i1 = c1 + 1;
		int i2 = 'k' - 'j';
		int i3 = 10 - '0';
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
	}

}
