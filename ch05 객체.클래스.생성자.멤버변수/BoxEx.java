package ch05;

public class BoxEx {
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box();
		
		box1.height = 10; 
		box1.width = 15; 
		box1.depth = 18;
		
		box2.height = 11; 
		box2.width = 12; 
		box2.depth = 15;
		
		box1.volume();
		box2.volume();
		System.out.println();
		
		Car1 c1 = new Car1();
		c1.color = "파랑"; c1.displacement = 2500; c1.name = "BMW";
		System.out.println("색깔 : " + c1.color);
		System.out.println("배기량 : " + c1.displacement);
		System.out.println("이름 : " + c1.name);
		c1.speedUp();
		c1.stop();
		
		}

}
