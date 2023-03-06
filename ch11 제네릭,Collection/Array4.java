package ch11;

import java.util.ArrayList;

public class Array4 {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("산딸기"); al1.add("집딸기"); al1.add("판딸기");
		al1.add("죽은딸기"); al1.add("알칼리딸기"); al1.add("산딸기");
		
//		인덱스 2번에 뱀딸기 추가하고 출력
//		인덱스 4번 데이터를 안심딸기로 변경하고 출력
//		인덱스 1번 데이터를 지우고 출력
//		산딸기를 지우고 출력
		
		al1.add(2, "뱀딸기");
		prn(al1);
		
		al1.set(4, "안심딸기");
		prn(al1);
		
		al1.remove(1);
		prn(al1);
		
		al1.remove("산딸기");
		prn(al1);
		
	}

	private static void prn(ArrayList<String> al1) {
		for(String a : al1) {
			System.out.print(a + "\t");
		}
		System.out.println();
		
	}

}
