package ch05;
class Car4 {
	String carNo; 	// 차량번호
	int inTime; 	// 입고시간 (들어오는 시간)
	int outTime; 	// 출고시간 (나가는 시간)
	int fee; 		// 주차요금
	final int MONEY_PER_HOUR = 3000; // 시간 당 주차요금
//	생성자 cno, in, out을 입력받고
//	calFee(출고 - 입고) * 시간단가
//	차량번호, 입고시간, 출고시간, 주차요금 출력 prn()
	Car4(String cno, int in, int out) {
		carNo = cno;
		inTime = in;
		outTime = out;
		fee = (out - in) * MONEY_PER_HOUR;
	}
	void calFee() {
		fee = (outTime - inTime) * MONEY_PER_HOUR;
	}
	void prn() {
		System.out.println("차량번호: " + carNo);
		System.out.println("입고시간: " + inTime);
		System.out.println("출고시간: " + outTime);
		System.out.println("주차요금: " + fee);
		System.out.println("========================");
	}
	
}

public class Car4Ex {
	public static void main(String[] args) {
//		"가 1234", 10, 13
//		"나 3456", 9, 18
//		"다 6789", 11, 16
		Car4 c1 = new Car4("가 1234", 10, 13);
		Car4 c2 = new Car4("나 3456", 9, 18);
		Car4 c3 = new Car4("다 6789", 11, 16);
//		첫번째 방법
//		c1.calFee(); c2.calFee(); c3.calFee();
//		c1.prn(); c2.prn(); c3.prn(); 
		
//		두번째 방법: 데이터형이 많을 때
		Car4[] cars = {c1, c2, c3};
		for(Car4 car : cars) {
			car.calFee();
			car.prn();
		}
 	}

}
