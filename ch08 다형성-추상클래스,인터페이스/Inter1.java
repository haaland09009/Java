package ch08;

// * interface
//1) 모든 변수는 public static final이 생략됨. // 객체 생성하지 않고 바로 사용 가능
//                   // 값을 변경하지 않는다.(final)
//2) 모든 메서드는 public abstract가 생략됨 : 선언부는 있지만 구현부가 없다.
//3) Java 1.8(8.0) 부터는 default / static으로 시작하는 메서드는 구현부가 있다.

// * 인터페이스를 사용하는 이유
// 1. 접속/연결 클래스 간에 결합도를 낮춘다.-> upgrade가 쉽다.
// 2. 양식처럼 사용
// 3. 다중상속을 지원

// * 인터페이스를 구현할 때 
// class 클래스명 implements 인터페이스   // 인터페이스를 다중 구현 가능
// interface 인터페이스명 extends 인터페이스,... { // 인터페이스는 다중 상속 가능

interface A1 { // 인터페이스는 객체를 생성할 수 없다.
	int K = 7 ; // int K 앞에 사실은 public static final이 생략된 것임. 값 변경 불가
	void m1(); // void m1 앞에 사실은 public abstract가 생략된 것임. 구현부가 없음.
	void m2();
}

class A2 implements A1 { // 인터페이스를 사용하기 위해서는 implements 구현한 클래스로 사용
	@Override
	public void m1() {
		System.out.println("대박");
	}
	@Override
	public void m2() {
		System.out.println("사건");
	} 	
}

public class Inter1 {
	public static void main(String[] args) {
//		A1 a = new A1(); // 에러 발생 -> 인터페이스는 객체 생성 불가
		A1 a1 = new A2();	// 생성은 안되지만 선언은 가능
	    A2 a2 = new A2();
	    a1.m1(); a1.m2(); a2.m1(); a2.m2();
//	    a1.K = 88; 이렇게 적으면 에러 발생 -> final이므로 수정 불가능하기 때문
	    System.out.println("K = " + A1.K); // static이 생략되어 있어서 바로 쓸 수 있다.
	    System.out.println("K = " + a1.K);
	}

}
