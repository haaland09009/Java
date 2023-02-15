package ch02;

public class Char2 {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '대'; // '' 문자
//		char c3 = "헐";  (에러 발생)""는 문자열을 담을 때 사용한다.
//		char c4 = 'aa'; (에러 발생) 문자는 한 글자만 선언된다.
		char c5 = '\u0041'; // \\u는 유니코드라는 의미
//		char c6 = ''; // 한 글자는 있어야함.
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c5 = " + c5);
	}

}
