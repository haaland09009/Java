package ch12;
class Thread_1 extends Thread{
	public Thread_1(String title) {
		super(title);
	}

	public void run() {  // 쓰레드를 실행하는 메서드
		for(int i = 0; i < 100; i++) {
			System.out.print(getName() + i + "\t");
			if (i % 9 == 0)
				System.out.println();
			try {
				Thread.sleep(500); // 0.5초 쉬어라 	단위: 1/1000초
			} catch (InterruptedException e) {

			}
		}
	}
}

public class ThreadEx1_ {
	public static void main(String[] args) {
		Thread_1 th1 = new Thread_1("th1");
		Thread_1 th2 = new Thread_1("th2");
//		th1.run(); 쓰레드를 쓰지 않을 경우
		th1.start(); th2.start(); // start: 메모리에 들어가기 위해 준비하는 것
		for(int i = 0; i < 100; i++) {
			System.out.print("main" + i + "\t");
			if (i % 9 == 0)
				System.out.println();
			try {
				Thread.sleep(500); // 0.5초 쉬어라 	단위: 1/1000초
			} catch (InterruptedException e) {

			}
		
	}
		System.out.println("프로그램 종료");
}
}