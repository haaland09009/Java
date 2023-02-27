package ch08;
//interface B1  K1 = 10, m1()
//interface B2  B1을 상속, m2()
//interface B3  m3()
//interface B4  B2와 B3을 상속 m4()

//class B5는 B4를 구현
//	m1 헉, m2 허각, m3 허공, m4 헐~

//class Inter2 main B5를 생성하여 m1(),m2(),m3(),m4()를 실행하고 K1을 출력

interface B1 {
	int K1 = 10;
	void m1();
}

interface B2 extends B1 {
	void m2();
}

interface B3 {
	void m3();
}

interface B4 extends B2, B3 {
	void m4();
}

class B5 implements B4 {
	@Override
	public void m1() {
		System.out.println("헉");
	}
	@Override
	public void m2() {
		System.out.println("허각");
	}
	@Override
	public void m3() {
		System.out.println("허공");
	}
	@Override
	public void m4() {
		System.out.println("헐~");
	}
	
}

public class Inter2 {
	public static void main(String[] args) {
		B5 b = new B5();
		b.m1(); b.m2(); b.m3(); b.m4(); 
		System.out.println("K1 = " + B5.K1);
	}

}
