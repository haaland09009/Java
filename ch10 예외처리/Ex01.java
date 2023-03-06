package ch10;

public class Ex01 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				throw new ArithmeticException(); // throw : 에러를 발생시킨다, arith-는 runtime-의 자식이다. 
			System.out.println(2); // 예외가 발생하면 실행되지 않는 문장
		} catch (RuntimeException r) { // arithmetic : 가까운 에러
			System.out.println(3);
			return; // 메서드를 빠져나간다.(finally 블럭을 수행한 후에)
		} catch (Exception e) { // exception : 제일 넓은 범위의 에러
			System.out.println(4);
			return;
		} finally {
			System.out.println(5); // 예외발생여부에 관계없이 항상 실행되는 문장
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		method(false);
	}

}
