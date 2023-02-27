package ch08;
//Car
//drive() 추상메서드
//---- 밑에는 Car 클래스를 상속받는다.
//FireEngine  물을 싣고 달린다
//fire() 불을 끈다
//Bus 승객 40명을 싣고 달린다
//Taxi 총알처럼 달린다

//CarEx에서 Bus,Taxi, FireEngine drive 실행
//		원래 FireEngine이면 fire()도 실행
public class CarEx {
	public static void main(String[] args) {
		Car[] cars = {new FireEngine(), new Bus(), new Taxi()};
		for(Car car : cars) {
			car.drive();
			if (car instanceof FireEngine) 
				((FireEngine)car).fire();
		}
		
	}
}
