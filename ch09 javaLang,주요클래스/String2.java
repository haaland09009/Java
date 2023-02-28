package ch09;

public class String2 {
	public static void main(String[] args) {
		System.out.println(2+0+2+3+"년도"); // 숫자 + 숫자 -> 숫자 ,앞에서부터 연산
		System.out.println("년도 : " + 2+0+2+3); // 문자열 + 숫자 -> 문자열 (문자열의 범위가 넓기 때문)
		System.out.println();
		String s1 = new String("대박");
		String s2 = "쪽박";
		char[] ch = {'내','일','휴','일'};
		String s3 = new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println();
		System.out.println(s1 + s2 + s3);
//					 012 3456 789
		String s4 = "내일은,삼일절,대박";
		String[] s5 = s4.split(","); // split: 배열을 만들 때 사용한다.
		for(int i = 0; i < s5.length; i++) {
			System.out.println(s5[i]);
		}
		System.out.println(s4.substring(2, 7)); // 인덱스 2번째부터 7번 앞까지
		System.out.println(s4.substring(4)); // 인덱스 4부터 끝까지
		System.out.println(s4.startsWith("내"));
		System.out.println(s4.startsWith("일"));
		System.out.println(s4.endsWith("박"));
		System.out.println(s4.endsWith("대"));
		System.out.println(s4.indexOf("일")); // 앞에서부터 찾아서 발견된 일의 index
		System.out.println(s4.lastIndexOf("일")); // 뒤에서부터 찾아서 발견된 일의 index
		System.out.println(s4.contains("일")); // 포함여부
		System.out.println(s4.contains("이"));
	}

}
