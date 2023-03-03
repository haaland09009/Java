package ch10;

public class Except3 {
	public static void main(String[] args) {
		int[] x = {12,45,25,0,17};
//		100을 x[0] ~ x[5]까지 숫자로 나눠서 출력, 예외가 발생하면 처리하는 catch문, 마지막은 Exception으로 처리
//		finally : 재밌니 출력
		
		int num = 100;
		for(int i = 0; i < x.length; i++) {
			try {
			System.out.printf("%d / %d = %d\n", num, x[i], num / x[i]);
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (Exception e) {
				System.out.println("연산을 실행할 수 없습니다.");
			} finally {
				System.out.println("재밌습니까?");
			}
		}
		
	}

}
