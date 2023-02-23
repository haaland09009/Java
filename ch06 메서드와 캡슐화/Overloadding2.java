package ch06;
class Box {
	int volume(int x, int y, int z) {
		return x * y * z;
	}
	
	double volume(double x, double y, double z) {
		return x * y * z;
	}
	
}

public class Overloadding2 {
	public static void main(String[] args) {
		Box b1 = new Box(); System.out.println("정수연산 부피 : " + b1.volume(12, 15, 20));
		Box b2 = new Box(); System.out.println("실수연산 부피 : " + b2.volume(12.7, 5.6, 7.4));
//		실수와 정수가 섞여있는 정수는 실수로 변경가능 (실수가 범위가 더 넓기 때문에) , 실수는 강제형변환하지 않으면 정수로 변환불가
		Box b3 = new Box(); System.out.println("정수,실수연산 부피 : " + b3.volume(15.2, 5, 20));
		
		
	}

}
