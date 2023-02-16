package ch02;

public class Oper5 {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = (char) (c1 + 1);
		char c3 = ++c1;
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
	}

}
