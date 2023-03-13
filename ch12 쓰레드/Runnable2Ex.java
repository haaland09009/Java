package ch12;

//Run2 i=1부터 10  현재 쓰레드명 + i 
//RunnableEx2 Run2 hello, hi,hey

class Run2 extends Object implements Runnable{ // run 메서드를 재정의해야함
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + i + " ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
			}
		}
		
	}
}


public class Runnable2Ex {
	public static void main(String[] args) {
		Run2 r1 = new Run2();
		Run2 r2 = new Run2();
		Run2 r3 = new Run2();
		
		Thread th1 = new Thread(r1, "hello");
		Thread th2 = new Thread(r2, "hi");
		Thread th3 = new Thread(r3, "hey");
		
		th1.start(); th2.start(); th3.start();
	}

}
