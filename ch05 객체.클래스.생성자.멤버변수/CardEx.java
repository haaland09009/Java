package ch05;

class Card {
	static int width, height; // 가로 100, 세로 240
	String kind;
	int number;
	void prn() {
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("종류 : " + kind);
		System.out.println("번호 : " + number);
		System.out.println("=======================");		
	}
}

public class CardEx {
	public static void main(String[] args) {
		// 스페이드, 다이아몬드, 클로버 7, 1, 10
		Card.height = 240; Card.width = 100;
		Card c1 = new Card();
		Card c2 = new Card();
		Card c3 = new Card();

		c1.kind = "스페이드"; c1.number = 7;
		c2.kind = "다이아몬드"; c2.number = 1;
		c3.kind = "클로버"; c3.number = 10;
		
		c1.prn();
		c2.prn();
		c3.prn();
	}

}
