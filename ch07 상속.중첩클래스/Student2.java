package ch07;

// setage를 쓰고 안쓰는 것의 차이를 보면서 공부하기 -> setage 대신 super 사용

public class Student2 extends Person2 {
	private String sno;
	public Student2(String name, int age, String sno) {
		super(name, age); this.sno = sno;
	} 
	void print() {
		super.print();
		System.out.println("학번 : " + sno);
	}
	

}


class Teacher2 extends Person2 { // 처음에 작성할때 부모에서 기본생성자가 없기 때문에 에러가 나는거임.
	private String subject; 
	public Teacher2(String name, int age, String subject) {
		super(name, age); this.subject = subject;
		
	}
	void print() {
		super.print();
		System.out.println("과목 : " + subject);
	}
	
}

class Manager2 extends Person2 {
	private String part;
	public Manager2(String name, int age, String part) {
		super(name, age); this.part = part;
	}
	void print() {
		super.print();
		System.out.println("담당 : " + part);
	}
	
	
}