package ch09;

//Card 
//kind, number
//생성자를 통하여 초기값 설정
//
//CardEx
//card 1,2,3 스페이드 10, 스페이드 7, 하트 10
//
//1) 번호가 같으면 같다고 변경하고 확인
//2) 종류가 같다면 같다고 수정하고 확인
//3) 출력 형식: 카드[종류:xxx, 번호:xxx]
class Card{
	String kind;
	int number;
	public Card(String kind, int number) {
		this.kind = kind; this.number = number;
	}
	public boolean equals(Card obj) {
//		return number == ((Card)obj).number;  //기본형은 == 쓰기
		return kind.equals(obj.kind);
	}
	public String toString() {
		return "카드[종류:" + kind + ", 번호: " + number + "]";
	}

}

public class CardEx {
	public static void main(String[] args) {
		Card card1 = new Card("스페이드", 10);
		Card card2 = new Card("스페이드", 7);
		Card card3 = new Card("하트", 10);
		
		if (card1.equals(card2)) System.out.println("card1과 card2는 같다");
		else System.out.println("card1과 card2는 다르다");
		if (card1.equals(card3)) System.out.println("card1과 card3는 같다");
		else System.out.println("card1과 card3는 다르다");
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		
	}

}
