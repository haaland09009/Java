package ch11;

import java.util.ArrayList;

public class Gene2 {
	public static void main(String[] args) {
		// 제네릭: 클래스뿐만 아니라 인터페이스도 쓸 수 있다.
//		Generics에 클래스나 인터페이스 이름이 들어가면 그 클래스 또는 상속받거나 구현한 클래스만 사용 가능
		ArrayList<Car> list = new ArrayList<>();
		list.add(new Bus()); list.add(new Ambulance());
		list.add(new FireEngine()); // list.add(new Taxi()); 에러 발생
		// car를 구현하는 클래스만 사용 가능
		
//		print 메서드 사용, Bus인 경우 move 메서드 실행하기
		for(Car car : list) {
			car.print();
			if (car instanceof Bus) ((Bus) car).move();
		}
		
	}

}
