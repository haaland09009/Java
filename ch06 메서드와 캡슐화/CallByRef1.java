package ch06;

class C1 { // m1에 들어간 이름은 안중요함
	void m1(int[] num) {
		num[0] = 77; num[1] = 100; // 전달된 주소를 찾아가서 값을 변경
		for(int i = 0; i < num.length; i++) {
			System.out.println("m1 num["+i+"] = " + num[i]);
		}
		
	}
}

public class CallByRef1 {
	public static void main(String[] args) {
		C1 c1 = new C1();
		int[] num = {12, 34, 66}; // 배열은 참조형, 참조형 데이터는 주소를 전달한다.
		c1.m1(num);				 // call by reference: 참조형은 주소를 전달하므로 메서드에서 바뀌면 원본 데이터도 바뀐다.
		for(int i = 0; i < num.length; i++) {
			System.out.println("main num["+i+"] = " + num[i]);
		}
	}

}
