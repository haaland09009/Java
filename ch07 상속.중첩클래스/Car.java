package ch07;

// Car(print) kind, inwon / 출력: print() 차종류: 승차인원: 
//상속 :  Ambulance(printAm 환자를 싣고 달린다.), Bus(printBus 승객 40명 이상을 태울 수 있다.), FireEngine(printFe 불을 끄는 차량입니다.) 
// CarEx 3개를 생성하고 출력

// getter and setter 단축키: alt shift s + r
public class Car {
	private String kind;
	private int inwon;

	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setInwon(int inwon) {
		this.inwon = inwon;
	}
	void print() {
		System.out.println("===============");
		System.out.println("종류: " + kind);
		System.out.println("승차인원: " + inwon);
	}
}
