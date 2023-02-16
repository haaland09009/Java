package ch03;

public class If2 {
	public static void main(String[] args) { // 매개변수, 독립변수
//		Integer.parseInt : args[0]에 들어있는 값을 정수로 변경하라
		int i1 = Integer.parseInt(args[0]);  // 나중에 배울거임.
		if (i1 > 0) { 
			System.out.println("양수 : " + i1);
			System.out.println("대박");
		} else { 
			System.out.println("음수: " + i1);
			System.out.println("쪽박");
		}
		
		
	}

}
