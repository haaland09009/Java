package ch11;

import java.util.ArrayList;

public class Array3 {
	public static void main(String[] args) {
		ArrayList<String> snakes = new ArrayList<>();
		snakes.add("구렁이"); snakes.add("팔렁이"); snakes.add("구렁삼");
		snakes.add("구렁사"); snakes.add("구렁이"); prn(snakes);
		snakes.add(1, "구렁오"); // index 1에 "구렁오" 추가, 1에 데이터가 들어가면서 index가 뒤로 이동
		prn(snakes);
		
	    snakes.set(4, "도마뱀"); // index 4번째 값을 변경
	    prn(snakes);
	    
	    snakes.remove(2); // 해당하는 인덱스를 지우면 뒤는 하니씩 앞으로 당겨진다. 
	    prn(snakes);
	    
	    snakes.remove("구렁이"); // 처음 발견된 "구렁이"를 지우고 인덱스가 하나씩 당겨진다. 나머지 "구렁이"는 안지워짐
	    prn(snakes);
	}

	private static void prn(ArrayList<String> snakes) {
		for(String snake : snakes) {
			System.out.print(snake + "\t");
		}
		System.out.println();
	}

}
