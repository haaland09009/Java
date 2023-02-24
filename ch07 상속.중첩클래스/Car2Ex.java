package ch07;

public class Car2Ex {
	public static void main(String[] args) {
		Engine eg1 = new Engine(2000, "GDI");
		Engine eg2 = new Engine(1500, "DOHC");
		
		Car2 c1 = new Car2(eg1, "빨강");
		Car2 c2 = new Car2(eg1, "초록");
		Car2 c3 = new Car2(eg2, "파랑");
		
		c1.print(); c2.print(); c3.print();
		System.out.println("-----------------------");
		
		Car2[] car = {c1, c2, c3};
		for(int i = 0; i < car.length; i++) {
			car[i].print();
		}
		
		System.out.println("-----------------------");
		Car2[] cars = {c1, c2, c3};
		for(Car2 c : cars) {
			c.print();
		}
	}

}
