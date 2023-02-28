package ch08;

// !!!! 인터페이스는 바로 사용할수 없다. 인터페이스를 구현하는 클래스가 있어야한다. !!!!
public interface RemoteControl {
//	interface의 상수는 public static final이 생략된 것이기 때문에 대문자를 쓴 것이다. -> 바뀔 수 없는 데이터
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
//	interface의 메서드는 public abstract가 생략된 것이다.
	void turnOn();
	void turnOff();
//	default method는 구현부를 만들 수 있다
	default void setMute(boolean mute) {
		if (mute) System.out.println("무음 처리합니다");
		else System.out.println("무음을 해제합니다.");
	}
//	static method도 구현부를 만들 수 있다
	static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
}


