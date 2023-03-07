package ch11;

import java.util.HashSet;
import java.util.Iterator;

// set은 인덱스가 없으므로 순서가 뒤죽박죽으로 출력됨

public class Set1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("사과"); set.add("포도"); set.add("사과");
		set.add("키위"); set.add("바나나"); set.add("바나나");
		System.out.println("개수 : " + set.size());

		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=============");
		for(String str : set) {
			System.out.println(str);
		}
	}

}
