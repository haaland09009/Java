package ch09;
//String str = "우리는 친구였어, 곁에 있으면 듣든한 친구"
//1) 인덱스 5부터 10이전까지 출력
//2) 인덱스 7부터 끝까지 출력
//3) "친"이라는 글자의 인덱스. 앞에서부터, 뒤에서부터
//4) "우"로 시작하는지?
//5) "친"으로 끝나는지 확인
//6) "대"라는 글자가 포함됏는지
//7) " "로 배열로 만들어서 출력
public class String3 {
	public static void main(String[] args) {
		String str = "우리는 친구였어, 곁에 있으면 듣든한 친구";
		System.out.println(str.substring(5, 10));
		System.out.println(str.substring(7));
		System.out.println(str.indexOf("친"));
		System.out.println(str.lastIndexOf("친"));
		System.out.println(str.startsWith("우"));
		System.out.println(str.endsWith("친"));
		System.out.println(str.contains("대"));
		String[] str1 = str.split(" ");
		for (String s : str1) {
			System.out.println(s);
		}
	}

}
