package ch07;

public class Person2 {
	private String name;
	private int age;
	public Person2(String name, int age) {
		this.name = name; this.age = age;
	}
	void print() {
		System.out.println("===================");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
