package ch07;
class E1 {
//	기본 생성자는 생성자가 하나도 없으면 컴파일할 때 만들어 준다. 하나라도 있으면 안 만들어진다.
	E1() {
		System.out.println("기본 생성자");
	}
	E1(int k) { // 하나라도 생성자가 있으면 기본 생성자가 생성되지 않는다.
		System.out.println("난 매개변수가 하나인 생성자 : " + k);
	}
	void m1() {
		System.out.println("대박");
	}
}

class E2 extends E1 {
//	특별한 것이 없으면 부모의 기본 생성자를 통하여 생성.
	E2 (int k) { // E1의 기본 생성자를 작성하지 않으면 여기서 에러가 발생한다. -> E1의 매개변수 k에 전달할 데이터가 없어서 에러가 발생한 것.
		super(k); // 기본 생성자가 아닌 매개변수 1개인 생성자로 부모가 생성된 후에 자식이 생성된다. 부모의 생성자를 부를 때 사용하는 것이 super
		System.out.println("오홍");
	}
	void m2() {
		System.out.println("쪽박");
	}
}
public class Super1{
	public static void main(String[] args) {
		E2 e = new E2(7);
		e.m1(); e.m2();
	}
}
