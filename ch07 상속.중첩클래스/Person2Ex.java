package ch07;

public class Person2Ex {
	public static void main(String[] args) {
		Person2[] person = new Person2[6];
		person[0] = new Student2("로제", 26, "970201");
		person[1] = new Student2("보검", 29, "960201");
		person[2] = new Student2("제니", 27, "자바");
		person[3] = new Student2("은우", 32, "DataBase");
		person[4] = new Student2("효리", 38, "화장실 청소");
		person[5] = new Student2("화사", 26, "운전");
		
		for(Person2 p : person) {
			p.print();
		}
	}

}
