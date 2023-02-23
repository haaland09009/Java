package ch06;

public class PersonEx {
	public static void main(String[] args) {
//		직접 가져오지 못하게 private 사용, 직접 쓰지 않고 메소드 안에서 조건문을 넣어서 필터링할 수 있게 해준다 -> 정보은닉, 캡슐화
		Person ps1 = new Person();
//		ps1.name = "하니"; 에러발생
		ps1.setName("하니");

		ps1.setAge(12);

		ps1.print();
//		로제 26, 보검 29
		
		Person ps2 = new Person();
		ps2.setName("로제"); ps2.setAge(26); ps2.print();
	
		Person ps3 = new Person();
		ps3.setName("보검"); ps3.setAge(29); ps3.print();
	}

}
