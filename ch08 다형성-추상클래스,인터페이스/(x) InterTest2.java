package ch08;
interface E {
	void b1();
}
//인퍼페이스를 구현한 E2, E3를 사용하면 메서드가 하나처럼 사용
//실행하는 클래스 InterTest2와 사용하는 클래스를 E2,E3를 인터페이스를 통하여 연결
//결합도를 느슨하게 해준다.
class E1 {
	void b1(E e) {
		e.b1();
	}
}
class E2 implements E { // 처음에 적을때 빨간줄이 생김.-> 인터페이스 구현을 하는데 아직 재정의를 안해서 그렇다.
	@Override
	public void b1() {
		System.out.println("대박");
	}
}
class E3 implements E { // 
	@Override
	public void b1() {
		System.out.println("쪽박");
	}
}
public class InterTest2 {
	public static void main(String[] args) {
//		E2 e = new E2();
		E3 e = new E3();
		E1 e1 = new E1();
		e1.b1(e);
	}
}
