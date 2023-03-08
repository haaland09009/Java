package ch11;

import java.util.Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		String[] arr1 = {"J","A","V","A"};
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
//											  인덱스 1부터 3 앞까지 복사
		String[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		
		String[] arr4 = new String[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		
		System.out.println(arr1); // 객체출력형식: 패키지명.클래스명@해시코드
		System.out.println(Arrays.toString(arr1)); // 배열 객체에 들어있는 값을 출력
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
	}

}
