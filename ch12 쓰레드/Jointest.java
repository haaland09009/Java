package ch12;
import java.util.ArrayList;

public class Jointest {
	public static ArrayList<String> carList = new ArrayList<>();
	
	public static void main(String[] args) throws InterruptedException {
		BeforeThread1 bt = new BeforeThread1("before");
		AfterThread1 at = new AfterThread1("After");
		bt.start();
		bt.join(); // bt의 작업이 종료한 후에 at를 작업, 순서가 필요할 때 사용하는 것이 join
		at.start();
		
		// 멀티쓰레드라도 순서가 필요한 경우에는 join을 사용한다.
		
	}

}
