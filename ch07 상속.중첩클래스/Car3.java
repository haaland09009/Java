package ch07;

public class Car3 {
	String color = "파랑";
	void drive() {
		System.out.println("가는 거야 !!");
	}
}


class FireEngine3 extends Car3 {
	String color = "빨강";
	void drive() {
		System.out.println("물을 싣고 달린다.");
	}
	void fire() {
		System.out.println("불끄러 가는 거야");
	}
}

class Ambulance3 extends Car3 {
	String color = "흰색";
	void drive() {
		System.out.println("환자를 싣고 달린다.");
	}
}

class Bus3 extends Car3 {
	void drive() {
		System.out.println("45명까지 싣고 달린다.");
	}
}

