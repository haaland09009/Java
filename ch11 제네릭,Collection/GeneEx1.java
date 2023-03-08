package ch11;

class GeneT<T> { // 객체 선언/생성할 때 T의 데이터형이 결정된다
	T[] v;
	public void set(T[] v) {
		this.v = v;
	}
	public void print() {
		for(T s : v) {
			System.out.println(s);
		}
	}
}

public class GeneEx1 {
	public static void main(String[] args) {
		GeneT<String> gt = new GeneT<>();
		String[] ss = {"가","나","다"};
		gt.set(ss);
		gt.print();
		System.out.println("==================");
		
		GeneT<Integer> gt2 = new GeneT<>();
		Integer[] kk = {34, 78, 99, 37};
		gt2.set(kk);
		gt2.print();
	}

}
