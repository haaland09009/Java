package ch12;
class Thread1 extends Thread{
	public void run() {  // 쓰레드를 실행하는 메서드
		for(int i = 0; i < 100; i++) {
			System.out.print("Thread" + i + "\t");
			if (i % 9 == 0)
				System.out.println();
			try {
				Thread.sleep(500); // 0.5초 쉬어라 	단위: 1/1000초
			} catch (InterruptedException e) {

			}
		}
	}
}

public class ThreadEx1 {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread1 th2 = new Thread1();
//		th1.run(); 쓰레드를 쓰지 않을 경우
		th1.start(); th2.start();
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