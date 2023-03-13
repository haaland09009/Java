package ch12;

public class Account2User extends Thread {
	boolean flag;
	Account2 act; // 포함관계 변수 참조변수
	String name;
	public Account2User(Account2 act, String name) {
		this.act = act; this.name = name;
	}
	@Override
	public void run() {
//		false와 true를 번걸아가면서 사용하여 출금과 입금을 발생시킨다
		for(int i = 0; i < 5; i++) {
//			계좌를 동시에 두명이 사용하는 것을 방지, 이번엔 synchronized를 객체 앞에 집어넣기
//			1. 메서드 앞에 syn- 2. 객체 앞에 syn-
			synchronized (act) {
				int amt = (int)(Math.random()*10000) + 1;
				if (flag) act.deposit(amt, name); // 입금
				else act.withdraw(amt, name);
			}
			flag = !flag; // true면 false로, false면 true
			act.print();
			
		}
	
	}

}
