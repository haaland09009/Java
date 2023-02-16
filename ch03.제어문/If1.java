package ch03;

public class If1 {
	public static void main(String[] args) {
		int i1 = -7; // 중괄호가 있으면 중괄호 닫을 때까지 실행문 영향
		if (i1 > 0) { // 중괄호가 없으면 조건에 맞는 문장을 실행하는 것은 문장 하나
			System.out.println("양수");
			System.out.println("대박");
		} else { 
			System.out.println("음수");
			System.out.println("쪽박");
		}
		
		
	}

}
