package ch10;

//throws : 처리를 떠넘긴다.

public class Throws1 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			System.out.println("제가 처리하겠습니다. "+ e.getMessage());
//			e.printStackTrace(); // 에러가 발생한 흔적을 추적하여 출력
		}
	}
	
	private static void m1() throws Exception {
//		try {
			m2();
//		} catch (Exception e) {
//			System.out.println("제가 처리하겠습니다. " + e.getMessage());
//		}
	}
	private static void m2() throws Exception {
		throw new Exception("에러가 발생하였습니다");
	}

}
