package ch02;

public class Oper6 {
	public static void main(String[] args) {
		float pi = 3.141592f;
//							3141.592 => 3141 => 3.141			
		float shortPi = (int) (pi * 1000) / 1000f;
		System.out.println("shortpi = " + shortPi);
//							3141.592 => 3142 => 3.142 (round는 반올림)
		shortPi = Math.round(pi * 1000) / 1000f;
		System.out.println("shortpi = " + shortPi);

	}

}
