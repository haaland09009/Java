package ch06;

public class Return3 {
//	객체를 생성하여 사용하거나 static 붙여서 정적 변수로 만들어서 사용해야함.
	static String[] name = {"로제", "제니", "은우", "보검"};
	
	public static void main(String[] args) {
		String[] hello = {"hello", "안녕하세요", "Good Morning", "사외디캅"};
		for(int i = 0; i < name.length; i++) {
			String msg = hello(name[i], hello[i]);
			System.out.println(msg);
		}
		
	}

	private static String hello(String name, String hello) {
		return name +"님 !!! " + hello;
		
	}

}
