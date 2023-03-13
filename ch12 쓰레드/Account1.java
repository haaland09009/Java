package ch12;

// 메서드 앞에 동기화
public class Account1 {
	private int total;
	public Account1(int total) {
		this.total = total;
	}
//	synchronized 동시에 이 메서드를 사용하는 것을 금지
	synchronized void deposit(int amt, String name) {
		total += amt;
		System.out.println(name + "입금 : " + amt);
	}
	synchronized void withdraw(int amt, String name) {
		if (amt <= total) {
			total -= amt;
			System.out.println(name + "출금 : " + amt);
		} else System.out.println("잔액이 부족합니다. 돈을 인출할 수 없습니다.");
	}
	void print() {
		System.out.println("잔액 : " + total);
	}

}
