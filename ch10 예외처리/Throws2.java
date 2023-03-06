package ch10;

public class Throws2 {
	public static void main(String[] args)  {
		int[] k = {12, 45, 0, 32, 22};
		for (int i = 0; i <= k.length; i++) {
			try {
				m1(k[i]);
			} catch (Exception e) {
				System.out.println("에러가 발생하였습니다 : " + e.getMessage());
			}
		
		}
	}
	
//	!!!  throw: 본인이 처리한다. throws: 제 3자가 처리하도록 한다. try-catch: 내가 처리한다. !!!
	
	static void m1(int k) throws ArithmeticException {
//		try {
		m2(k);
//		} catch (Exception e) {
//			System.out.println("여기서 처리하겠습니다 : " + e.getMessage());
//		}
//	}
	}	
	private static void m2(int k) throws ArithmeticException {
			System.out.printf("%d / %d = %d\n", 100, k, 100 / k);
	
	}
	
}
