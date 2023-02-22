package ch05;

class Person {
	// name, age, hobby
	// default, name, name/age, name/age/hobby
	String name; int age; String hobby;
	Person() {
		
	}
	
	Person(String n) {
		name = n;
	}
	
	Person(String n, int a) {
		name = n;
		age = a;
	}	
	
	Person(String n, int a, String h) {
		name = n;
		age = a;
		hobby = h;
	}
	
	void prn() { // 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("취미 : " + hobby);
		System.out.println("====================");
	}
}

public class PersonEx {
	public static void main(String[] args) {
//		 4개의 생성자를 만들고 출력
//		로제/26/침뱉기, 차은우/32/울기, 제니/25/졸기, 박보검/33/놀기
		Person p1 = new Person(); p1.name ="로제"; p1.age = 26; p1.hobby = "침뱉기";
		Person p2 = new Person("차은우"); p2.age = 32; p2.hobby = "울기";
		Person p3 = new Person("제니", 25); p3.hobby = "졸기";
		Person p4 = new Person("박보검", 33, "놀기");
		
		p1.prn(); p2.prn(); p3.prn(); p4.prn();
				
				
		
	}

}
