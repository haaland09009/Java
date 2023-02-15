package ch02;

public class Cast2 {
	public static void main(String[] args) {
		byte b1 = 45;
		int i1 = b1; // 묵시적 형변환 
		System.out.println("b1 = " + b1);
		System.out.println("i1 = " + i1);
		int i2 = 77;
		byte b2 = (byte) i1; // 강제 형변환 / 명시적 형변환
		System.out.println("b2 = " + b2);
		System.out.println("i2 = " + i2);
		
		byte b3 = (byte) 128; // byte: -128 ~ 127
		System.out.println("b3 = " + b3); 
		
		byte b4 = (byte) 256; // byte: -128 ~ 127
		System.out.println("b4 = " + b4); // 쓰레기
	}


}
