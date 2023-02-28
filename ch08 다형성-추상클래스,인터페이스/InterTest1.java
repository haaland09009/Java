package ch08;
//  인터페이스를 안쓰는 경우
class D1 {
//	void m1(D2 d) { // 포함관계, 매개변수로 클래스를 쓸 때
//		d.b1();
//	}
	void m1(D3 d)  {
		d.b1();
	}
}
class D2 {
	void b1() {
		System.out.println("대박");
	}
}
class D3 {
	void b1() {
		System.out.println("쪽박");
	}
}
public class InterTest1 {
	public static void main(String[] args) {
//		D2 d2 = new D2();
		D3 d3 = new D3();
		D1 d1 = new D1();
//		d1.m1(d2);
		d1.m1(d3);
	}

}
