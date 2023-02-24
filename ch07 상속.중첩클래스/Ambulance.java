package ch07;

public class Ambulance extends Car {
	public Ambulance(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	void printAm() {
		print();
		System.out.println("환자를 싣고 달린다.");
	}
}

class Bus extends Car {
	public Bus(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	void printBus() {
		print();
		System.out.println("승객 40명 이상을 태울 수 있다.");
	}
}

class FireEngine extends Car {
	public FireEngine(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	void printFe() {
		print();
		System.out.println("불을 끄는 차량입니다.");
	}

}