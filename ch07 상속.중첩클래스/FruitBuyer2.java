package ch07;

public class FruitBuyer2 {
	int numberOfApple, money;
	String name;
	
	public FruitBuyer2(String name, int numberOfApple, int money) {
		this.name = name; this.numberOfApple = numberOfApple; this.money = money;
		
	}
	void buyFruit(FruitSeller2 fs, int amt) {
		int num = fs.saleApple(amt);
		numberOfApple += num;
		money -= amt;
	}
	void print() {
		System.out.println(name + " 사과갯수 : " + numberOfApple);
		System.out.println(name + " 금전잔액 : "  + money);
	}
}
