package ch11;
import java.util.ArrayList;

public class Gene1 {
	public static void main(String[] args) {
//		E: Element, K: Key, V: Value, T:Type
		ArrayList list = new ArrayList();
		list.add(1); list.add(2); list.add("안녕하세요");
		list.add(3); list.add(4); list.add("감사해요");
		System.out.println(list);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1); list2.add(2); // list2.add("안녕하세요");
		list2.add(3); list2.add(4); // list2.add("감사해요");
		System.out.println(list2);
	
	}

}
