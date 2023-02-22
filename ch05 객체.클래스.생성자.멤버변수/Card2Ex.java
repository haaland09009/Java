package ch05;
class Card2 {
	String kind;
	int number;
	
	Card2() {
		
	}
	
	Card2(String k) {
		kind = k;
	}
	
	Card2(String k, int n) {
		kind = k;
		number = n;
	}
	
	void prn() {
		System.out.println("종류 : " + kind);
		System.out.println("번호 : " + number);
		System.out.println("==================");
	}
}

public class Card2Ex {
	public static void main(String[] args) {
		Card2 c1 = new Card2(); c1.kind = "스페이드"; c1.number = 3;
		Card2 c2 = new Card2("하트"); c2.number = 7;
		Card2 c3 = new Card2("다이아몬드", 10);
		
		c1.prn();
		c2.prn();
		c3.prn();
		
		
		
	}

}
