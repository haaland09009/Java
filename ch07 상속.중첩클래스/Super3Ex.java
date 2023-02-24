package ch07;
//G1 G1(String name) name이 생성되었습니다
//	disp() 오늘 금요일이야
//	age = 17

//G2는 G1 상속받는다
//	age = 18
//	G2(String name) xxx야 반가워
//	disp() 공부하기 딱 좋은 날이구나
//	print() 
//		부모 나이, 자식 나이
//		부모 disp(), 자식 disp()


//Super3Ex
//	G2 g를 생성하고 print() 실행

class G1 {
	int age = 17;
	G1(String name) {
		System.out.println(name + "이 생성되었습니다.");
	}
	void disp() {
		System.out.println("오늘은 금요일이야.");
	}
}

class G2 extends G1 {
	int age = 18;
	G2(String name) {
		super(name); // super(매개변수,...) 없으면 부모 기본생성자가 호출된다. 근데 부모의 기본생성자가 명시되어 있지 않아서 오류가 발생한 것임
//		오류발생을 막으려면 부모의 기본생성자를 직접 작성하거나 자식 클래스에서 super를 작성해야함.
		System.out.println(name + "아 반가워");
	}
	void disp() {
		System.out.println("공부하기 딱 좋은 요일이구나");
	}
	void print() {
		super.disp();
		disp();
		System.out.println("부모 나이 : " + super.age);
		System.out.println("자식 나이 : " + age);
		
	}
}

public class Super3Ex {
	public static void main(String[] args) {
		G2 g = new G2("보검");
		g.print();
	}

}
