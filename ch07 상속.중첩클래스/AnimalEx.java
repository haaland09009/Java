package ch07;

//Animal x = 7; move 움직인다
//Pig x = 10; move 네발로 움직인다
//Bird  move 날개로 난다 eat 부리로 쪼아 먹는다
//Fish  move 지느러미를 사용하여 움직인다
//
//AnimalEx x와 move 실행하고 Bird인 경우에는 eat도 출력

public class AnimalEx {
	public static void main(String[] args) {

		Animal[] animals = {new Pig(), new Bird(), new Fish()};
		
		for (Animal animal : animals) {
			animal.move();
			System.out.println("x = " + animal.x);
			if (animal instanceof Bird)
				((Bird)animal).eat();
		}
		
		System.out.println("======================");
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();
			System.out.println("x = " + animals[i].x);
			if (animals[i] instanceof Bird) 
				((Bird) animals[i]).eat();
		}
		
	}

}
