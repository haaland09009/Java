package ch11;

// 객체를 정렬하기 위해서는 comparable을 구현해야 한다.
public class Member1 implements Comparable<Member1>{
	String name;
	public Member1(String name) {
		this.name = name;
	}
//	정렬할 기준을 재정의 한다.
	public int compareTo(Member1 o) {
		
		return name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return name;
	}

}
