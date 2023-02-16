package ch02;

public class Oper2 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
//		byte      int  int
//		byte b3 = b1 + b2; 에러 발생
		byte b3 = (byte) (b1 + b2);
		System.out.println("b3 = " + b3);
		
	}

}
