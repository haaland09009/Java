package ch08;
//Car
// drive() 추상메서드
//---- 밑에는 Car 클래스를 상속받는다.
//FireEngine  물을 싣고 달린다 + fire() [일반메서드] 불을 끈다
//Bus 승객 40명을 싣고 달린다
//Taxi 총알처럼 달린다

//CarEx에서 Bus,Taxi, FireEngine drive 실행
//		원래 FireEngine이면 fire()도 실행

public abstract class Car {
	abstract void drive();
}

class FireEngine extends Car {
	@Override
	void drive() {
		System.out.println("물을 싣고 달린다.");
	}
	void fire() {
		System.out.println("불을 끈다.");
	}
}

class Bus extends Car {
	@Override
	void drive() {
		System.out.println("승객 40명을 싣고 달린다.");
	}
}

class Taxi extends Car {
	@Override
	void drive() {
		System.out.println("총알처럼 달린다.");
	}
}
