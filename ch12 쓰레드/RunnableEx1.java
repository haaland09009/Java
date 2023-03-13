package ch12;
class Run1 implements Runnable {
//	class Run1 extends Object, Thread  -> 에러 발생, 자바는 다중 상속 지원 x ---> Runnable 구현하면 됨.
	public void run() {
		for(int i = 0; i < 20; i++) {
		// Thread.currentThread() : 현재 작업중인 쓰레드 Thread.currentThread().getName() : 현재 작업중인 쓰레드의 이름 읽어오기
			System.out.println(Thread.currentThread().getName()+ i + " "); 
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
			}
		}
		
	}
}

public class RunnableEx1 {
	public static void main(String[] args) {
		Run1 r1 = new Run1();
		Run1 r2 = new Run1();
		Run1 r3 = new Run1();
//	쓰레드를 상속받았을 때는 객체를 생성하고 start 메서드가 사용가능하였다. 
//	하지만 runnable를 구현했을 때는 쓰레드 안에다 객체를 넣고 start메서드를 실행한다
		Thread th1 = new Thread(r1, "1번");
		Thread th2 = new Thread(r2, "2번");
		Thread th3 = new Thread(r3, "3번");
		th1.start(); th2.start(); th3.start();
	
		
	}

}
