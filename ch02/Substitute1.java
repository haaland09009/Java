package ch02;

public class Substitute1 {
	public static void main(String[] args) {
		int k1 = 8; // 대입(배정) 연산자
		System.out.println("k1 = " + k1);
		k1 = k1 + 8; // 16
		System.out.println("k1 = " + k1);
		k1 += 8; // k1 = k1 + 8 = 24, 단축대입 연산자
		System.out.println("k1 = " + k1);
	}

}
