package ch06;

public class Single1Ex {
	public static void main(String[] args) {
//		객체를 출력 패키지명.클래스명@해시코드
		Single1 p1 = new Single1();
		Single1 p2 = new Single1();
		Single1 p3 = new Single1();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("===============");
		
//		객체 이름은 다르지만 주소가 같다.
		Single1 s1 = Single1.getInstance();
		Single1 s2 = Single1.getInstance(); // 메소드를 통해서 객체 생성
		Single1 s3 = Single1.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
//	 @ 뒤에는 주소임. 
	}

}
