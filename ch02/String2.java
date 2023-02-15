package ch02;

public class String2 {
	public static void main(String[] args) {
//		데이터형이 같은 것끼리 연산하면 결과도 같은 데이터 형
//               다른 것끼리 연산하면 결과는 범위가 넓은 데이터형으로 나옴		
//		문자열이 범위가 넓다
		System.out.println(2 + 0 + 2 + 3 + "년");
//		"년" + 2 -> "년2" 	
		System.out.println("년" + 2 + 0 + 2 + 3);
	}

}
