package ch05;

public class Car1Ex {
	public static void main(String[] args) {
//		myCar: 객체명, 레퍼런스명(참조명)
//		객체 선언   객체 생성
		Car1 myCar = new Car1(); // 객체 선언과 생성을 동시에 수행
//		객체명.멤버변수, 객체명.메서드(); 형식으로 사용
		myCar.color = "빨강"; myCar.displacement = 1500; myCar.name = "소나타";
		System.out.println(myCar.color);
		System.out.println(myCar.displacement);
		System.out.println(myCar.name);
		myCar.speedUp();
		
		Car1 yourCar; // 객체 선언
		yourCar = new Car1(); // 객체 생성
		yourCar.color = "노랑"; yourCar.displacement = 2000; yourCar.name = "벤츠";
		System.out.println(yourCar.color);
		System.out.println(yourCar.displacement);
		System.out.println(yourCar.name);
		yourCar.stop();

		
	}

}
