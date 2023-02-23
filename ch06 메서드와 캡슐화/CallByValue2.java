package ch06;
class B2 {
	void m1(int a, int b) { // 전달한 것은 x = 10, y = 20
//	    CallByValue: 메소드 안에서 바뀐 결과는 원래 데이터에 영향을 주지 않는다.
//		a와 b값을 서로 교환해서 출력
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("m1 x = " + a);
		System.out.println("m1 y = " + b);
	}
}

public class CallByValue2 {
	public static void main(String[] args) {
		B2 a1 = new B2();
		int x = 10, y = 20; 
		a1.m1(x,y);
		System.out.println("main x = " + x);
		System.out.println("main y = " + y);
		
	}

}
