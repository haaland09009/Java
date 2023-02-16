package ch02;

public class Logical2 {
	public static void main(String[] args) {
		boolean b1 = 5>3, b2 = 5<3, b3 = 5==3, b4 = 5!=3;
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		System.out.println("b4 = " + b4);
		
		System.out.println("b1 && b2 = " + (b1 && b2));
		System.out.println("b1 || b2 = " + (b1 || b2));
		System.out.println("b1 && b3 = " + (b1 && b3));
		System.out.println("b1 || b3 = " + (b1 || b3));

	
	}

}
