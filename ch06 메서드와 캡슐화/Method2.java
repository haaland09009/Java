package ch06;

public class Method2 {
	void cal(int x, int y) { // %d는 정수
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		System.out.printf("%d * %d = %d\n", x, y, x * y);
	}
	void cal(double x, double y) { // %f는 실수, 변수명은 중요하지 않음, 데이터형이 중요
		System.out.printf("%f + %f = %f\n", x, y, x + y);
		System.out.printf("%f * %f = %f\n", x, y, x * y);
	}
	public static void main(String[] args) {
		Method2 m2 = new Method2();
		for(int i = 0; i < 10; i++) {
			int x = (int)(Math.random() * 10) + 1;
			int y = (int)(Math.random() * 10) + 1;
			m2.cal(x, y);
			double a = (Math.random() * 10) ;
			double b = (Math.random() * 10) ;
			m2.cal(a, b); // 전달되는 것은 변수명이 아니라 값
		
		}
	}
}
