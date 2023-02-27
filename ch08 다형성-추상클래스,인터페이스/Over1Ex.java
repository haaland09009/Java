package ch08;

class Over1{ // final을 class앞에 붙이면 상속을 안하겠다는 뜻
	void m1() { // final을 메서드 앞에 붙이면 overriding 금지
		System.out.println("난 부모 메서드");
	}
}

class Over2 extends Over1 {
	@ Override // 어노테이션: 설명도 해주고 잘못여부 체크
	void m1() {
		System.out.println("난 자식 메서드");
	}
}

public class Over1Ex {
	public static void main(String[] args) {
		Over1 o1 = new Over1();
		Over1 o2 = new Over2(); // 부모 선언, 자식 생성
		
		o1.m1(); o2.m1();
	}

}
