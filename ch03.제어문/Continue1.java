package ch0217;

public class Continue1 {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println("나는 반복한다 : " + i);
			if(i>3)continue; //아래 문장 수행하지 않고 처음으로 돌아가 반복
			System.out.println("나도 : " + i);
		}
	}

}
