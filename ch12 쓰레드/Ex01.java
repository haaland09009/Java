package ch12;

// p47 연습문제 Thread 대신에 Runnable로 바꾸기
class Ex01 {
	public static void main(String args[]) {
//		Thread1 th1 = new Thread1();
		
//		1. Runnable 인터페이스를 구현한 크래스를 이용하여 객체 생성
		Thread3 r1 = new Thread3(); // runnable은 객체 생성
//		2. Thread 생성할 때 매개변수로 위에서 생성한 객체 전달
		Thread th1 = new Thread(r1);
//		3. 생성된 쓰레드 start
		th1.start();
	}
}

class Thread3 implements Runnable {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print('-');
		}
	}
}