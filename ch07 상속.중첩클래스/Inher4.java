package ch07;

//D3의 d 객체 생성 후에 각각 가능한 변수와 메서드를 실행할 것.
// 각각 생성자와 m1,m2,m3 메소드를 만들것
//D1 할아버지 생성자 int k1 = 7 m1() 난 할아버지
//D2 아버지 생성자 int k2 = 77 m2() 난 아버지
//D3 자식 생성자 int k3 = 777 m3() 난 자식


class D1 {
	int k1 = 7;
	D1() {
		System.out.println("난 할아버지 생성자");
	}
	void m1() {
		System.out.println("할아버지 메서드");
	}
}

class D2 extends D1 {
	int k2 = 77;
	D2() {
		System.out.println("난 아버지 생성자");
	}
	void m2() {
		System.out.println("아버지 메서드");
	}
}

class D3 extends D2 {
	int k3 = 777;
	D3() {
		System.out.println("난 자식 생성자");
	}
	void m3() {
		System.out.println("자식 메서드");
	}
}
public class Inher4 {
	public static void main(String[] args) {
		D3 d = new D3();
		System.out.println("k1 = " + d.k1);
		System.out.println("k2 = " + d.k2);
		System.out.println("k3 = " + d.k3);
		d.m1(); d.m2(); d.m3();
		
	}

}
