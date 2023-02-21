package ch0217;

import java.io.IOException;

public class IO1 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("한자리 정수를 입혁해");
		int num = System.in.read() - '0';//콘솔로부터 데이터를 한글자만 읽는다.아스키 코드로 인식함
		System.out.println("입력한 정수 : " + num);
	}
}
