package ch10;

public class Throw1 {
	public static void main(String[] args) {
		m1();
	}
	private static void m1() {
		m2();
	}
	private static void m2() {
		// 여기서 예외 발생
		try {
			// 개발하거나 테스트할 때 사용
			throw new Exception("에러가 발생하였습니다");	
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
