package ch07;

public class OuterEx {
	public static void main(String[] args) {
		Outer out = new Outer(100, 200);
//		Inner inner = new Inner(); 에러 발생
		Outer.Inner inner1 = out.new Inner(); // 내부 클래스 객체 생성할 때
		Outer.Inner inner2 = out.getInner(); 
	
		
		System.out.println(inner1.capacity());
		System.out.println(inner2.capacity());
		
		
}

}
