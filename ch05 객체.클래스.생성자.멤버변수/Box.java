package ch05;

public class Box {
	public Box() { // 기본 생성자, 클래스에 생성자가 없으면 컴파일할 때 생성자를 자동으로 만들어준다.
		
	}
	int height;
	int width;
	int depth;
	void volume() {
		System.out.println("부피는 " + height * width * depth);
	}

}
