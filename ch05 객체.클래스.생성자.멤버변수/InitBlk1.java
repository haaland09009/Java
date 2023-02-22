package ch05;

public class InitBlk1 {
	int[] k1 = new int[5]; // 객체를 생성한 후에 사용 가능
	static int[] k2 = new int[5]; // 클래스를 로딩하면 바로 사용 가능
//	k1[0] = 76;
	 { // 초기화 블럭: 실행문을 중괄호 속에 넣으면 메소드를 안 만들어도 된다. 객체를 생성한 후에 사용 가능, 객체를 생성할 때마다 실행
		for(int i = 0; i < k1.length; i++) {
			k1[i] = (int)(Math.random() * 20) + 1;
//			k2[i] = (int)(Math.random() * 20) + 1;	// 에러는 아니지만 권장 x
		}	
	}
	
	 static { // 정적 초기화 블럭, 클래스를 로딩하면 바로 사용 가능, 한번만 실행
			for(int i = 0; i < k2.length; i++) {
//				k1[i] = (int)(Math.random() * 20) + 1; // 에러
				k2[i] = (int)(Math.random() * 20) + 1;	
		}	
	 }
	

}
