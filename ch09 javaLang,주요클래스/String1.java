package ch09;

public class String1 {
	public static void main(String[] args) {
		String str1 = "java"; // 기본형처럼 사용
		String str2 = "java"; // 기본형처럼 사용
		String str3 = new String("java"); // 참조형처럼 사용
		
		if (str1.equals(str2)) System.out.println("eq str1과 str2는 같다.");
		else System.out.println("eq str1과 str2는 다르다.");
		if (str1.equals(str3)) System.out.println("eq str1과 str3는 같다.");
		else System.out.println("eq str1과 str3는 다르다.");
		System.out.println("==================");
		if (str1 == str2) System.out.println("== str1과 str2는 같다.");
		else System.out.println("== str1과 str2는 다르다.");
		if (str1 == str3) System.out.println("== str1과 str3는 같다.");
		else System.out.println("== str1과 str3는 다르다.");
	}

}
