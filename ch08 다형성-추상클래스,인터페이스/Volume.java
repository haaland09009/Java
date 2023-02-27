package ch08;
public interface Volume { // 인터페이스를 활용하여 다형성 구현, overriding을 이용
	void volumeUp();
	void volumeDown();
}
class Radio implements Volume {
	@Override
	public void volumeUp() { // 인터페이스는 public abstract이 생략된 것임. 그러므로 public 써줘야함.
		System.out.println("라디오 볼륨을 올려요");
	}
	public void volumeDown() {
		System.out.println("라디오 볼륨을 내려요");
	}
}
class TV implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("TV 볼륨을 올려요");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV 볼륨을 내려요");
	}
}
class Speaker implements Volume {
	@Override
	public void volumeUp() {
		System.out.println("스피커 볼륨을 올려요");
	}

	@Override
	public void volumeDown() {
		System.out.println("스피커 볼륨을 내려요");
	}
}

