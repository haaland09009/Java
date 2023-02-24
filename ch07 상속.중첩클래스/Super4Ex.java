package ch07;
class H1 {
	int x;
	H1(int x) { // 8
		this.x = x; // 9
		System.out.println("부모 매개변수 1개"); // 10
	}
	H1(int x, int y) { // 6
		this(x); // 7
		System.out.println("부모 매개변수 2개"); // 11
	}
	void print() {
		System.out.println("x = " + x);
	}
}

class H2 extends H1 {
	// 처음에 작성할때 빨간줄이 나오는건 부모의 기본생성자가 없기 때문
	H2(int x, int y) { // 4
		super(x, y); // 5
		System.out.println("자식 매개변수 2개"); // 12
	}
	H2(int x, int y, int z) { // 2
		this(x,y); // 3
		System.out.println("자식 매개변수 3개"); // 13
	}
	
}

public class Super4Ex {
	public static void main(String[] args) {
		H2 h = new H2(34, 66, 55); // 1
		h.print(); // 14
	}

}
