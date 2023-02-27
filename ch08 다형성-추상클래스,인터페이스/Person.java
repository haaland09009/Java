package ch08;

//	class Person  -> void move() 두 다리로 걷는다 int leg = 2;
//	interface Fish -> void swim();
//
//	Mermaid 인어 -> Person을 상속받고 Fish 구현
//   	swim 물속에서 헤엄친다.
//
//	MermaidEx
//  	move(), swim(), 다리갯수 leg

public class Person {
	int leg = 2;
	void move() {
		System.out.println("두 다리로 걷는다.");
	}
	public static void main(String[] args) {
		Mermaid m = new Mermaid();
		m.move();
		m.swim();
		System.out.println("다리 갯수 : " + m.leg);
				
	}
}


interface Fish {
	void swim();
}

class Mermaid extends Person implements Fish {
	@Override
	public void swim() {
		System.out.println("물 속에서 헤엄친다.");
	}
	
}

interface Bird {
	void eat();
}




