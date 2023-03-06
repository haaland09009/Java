package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1 {
	public static void main(String[] args) {
// <E> E : Elements 요소, 제네릭 쓰는 이유: 데이터형을 정하기 위해
//		개수가 정해지지 않음 (개수는 고정된 것이 아니라 유동적임) 배열은 개수가 정해져 있고 리스트는 정해지지 않음
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("구렁이"); al1.add("팔렁이"); // al1.add(888); 문자열이 아님
		al1.add("구렁삼"); al1.add("구렁사"); al1.add("구렁이");
		System.out.println("데이터 개수 : " + al1.size());
		for(int i = 0; i < al1.size(); i++) {
			System.out.print(al1.get(i) + "\t");
		}
		System.out.println();
		for(String str : al1) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
		Iterator<String> its = al1.iterator(); 
		while(its.hasNext()) { // 가져올 다음 데이터가 있는지? 
			System.out.print(its.next() + "\t"); // 다음 데이터를 가져와서 출력
		}
	}

}
