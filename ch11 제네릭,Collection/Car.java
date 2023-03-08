package ch11;

public interface Car {
	void print();
}

class Bus implements Car {
	@Override
	public void print() {
		System.out.println("저는 버스입니다");
	}
	void move() {
		System.out.println("정원이 40명입니다");
	}
}

class FireEngine implements Car {
	@Override
	public void print() {
		System.out.println("저는 자동차입니다");
	}
}

class Ambulance implements Car {
	@Override
	public void print() {
		System.out.println("저는 구급차입니다");
	}
}

class Taxi {
	public void print() {
		System.out.println("저는 택시입니다");
	}
}