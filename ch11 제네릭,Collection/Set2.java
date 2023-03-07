package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {
	public static void main(String[] args) {
//		산딸기, 판딸기, 산딸기, 죽은딸기, 알칼리딸기, 죽은딸기
//		확장 for와 iterator를 사용하여 출력
		
		
		HashSet<String> set = new HashSet<>();
		set.add("산딸기"); set.add("판딸기"); set.add("산딸기");
		set.add("죽은딸기"); set.add("알칼리딸기"); set.add("죽은딸기");

		Iterator<String> its = set.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		System.out.println("===================");
		
		for(String str : set) {
			System.out.println(str);
		}
	
	}

}
