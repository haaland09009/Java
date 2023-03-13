package ch12;
class Daemon1 extends Thread {
	public void run() {
		while(true) {
		System.out.println("데몬");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
		}
		
	}
}
}
public class DaeMon1Ex {
	public static void main(String[] args) {
		Daemon1 dm = new Daemon1();
//	 main 작업이 끝나면 모든 쓰레드를 종료하라는 명령: setDaemon(true) , 주의사항: 데몬쓰레드는 반드시 start()보다 앞에서 실행해야한다. 소스코드가 start()보다 위에 있어야함\
//		setDaemon: 주 작업이 끝나면 관련 작업도 다 같이 끝내라는 명령
		dm.setDaemon(true);
		dm.start();
		for(int i = 0; i < 20; i++) {
		System.out.println(i);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
		}
	}

}
}
