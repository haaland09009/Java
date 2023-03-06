package ch11;

//산딸기, 집딸기, 판딸기, 죽은딸기, 알칼리딸기, 산딸기
//일반 for문, 확장 for문, Iterator 사용하여 출력

import java.util.ArrayList;
import java.util.Iterator;

public class Arrays2 {
	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		s.add("산딸기"); s.add("집딸기"); s.add("판딸기"); 
		s.add("죽은딸기"); s.add("알칼리딸기"); s.add("산딸기");
		
		for(int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i) + "\t");
		}
		System.out.println();
		
		for(String straw : s) {
			System.out.print(straw + "\t");
		}
		System.out.println();
		
		Iterator<String> its = s.iterator();
		while(its.hasNext()) {
			System.out.print(its.next() + "\t");
		}
		
	}

}
