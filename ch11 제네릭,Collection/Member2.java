package ch11;

public class Member2 implements Comparable<Member2>{
	String name;
	int age;
	public Member2(String name, int age) {
		this.name = name; this.age= age;
	}
//  비교하는 기준
	public int compareTo(Member2 o) {
//		비교 대상은 문자열이어야 한다
		String age1 = age + ""; // 숫자 + 문자 = 문자
		String age2 = o.age + "";
		return age1.compareTo(age2);
//		return name.compareTo(o.name);
	}

	public String toString() {
		return name + "(" + age + ")";
	}

}
