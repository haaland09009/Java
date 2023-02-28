package ch08;

// !!! 추상클래스, 인터페이스는 직접 객체를 생성할 수 없으므로 인터페이스를 구현한 클래스를 통해서 객체 생성 !!!!
public class Tv1 implements RemoteControl {
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
}

class Radio1 implements RemoteControl {
	public void turnOn() {
		System.out.println("라디오를 켭니다");
	}
	public void turnOff() {
		System.out.println("라디오를 끕니다");
	}
}