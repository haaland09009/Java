package ch06;

public class Method3 {
// hello(String name) 안녕하세요, xxx님
	static void hello(String name) {
		System.out.println("안녕하세요, " + name + "님");
	}
	public static void main(String[] args) {
		String[] name = {"김연아", "제니", "보검", "은우", "로제"};
		for(String n : name) {
			hello(n);
		}
	}
}
