package ch06;
class B1 {
	void m1(int x, int y) {  // 전달한 것은 x = 10, y = 20 
		x += 7; y += 5;
		System.out.println("m1 x = " + x);
		System.out.println("m1 y = " + y);
	}

}

public class CallByValue1 {
	public static void main(String[] args) {
		
		B1 a1 = new B1();
		int x = 10, y = 20; // 데이터가 기본형인 경우
		a1.m1(x, y); // 값 10, 20을 전달한 것이지 변수 x, y를 전달한 것이 아니다
		System.out.println("main x = " + x);
		System.out.println("main y = " + y);
	}

}
