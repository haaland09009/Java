package ch06;
//name, kor, eng, math  생성자를 통하여 초기화 this 사용 prn() 이용하여 이름, 총점, 평균 출력
//
//하니 88,99,66
//로제 77,88,55
//보검 92,56,88
class Student2 {
	String name; int kor, eng, math; // 전역변수
	Student2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	void prn() {
		int tot = kor + eng + math;
		System.out.println("===============");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + tot / 3);
	}
}

public class Student2Ex {
	public static void main(String[] args) {
		Student2 st1 = new Student2("하니",88,99,66);
		Student2 st2 = new Student2("로제",77,88,55);
		Student2 st3 = new Student2("보검",92,56,88);
		// for문 써서 해보기 실습 때
		st1.prn(); st2.prn(); st3.prn();
	}

}
