package ch0217;

public class Break2 {
	public static void main(String[] args) {
		
		k : for(int i=1; i<=10; i++) {//k : label
			for(int j=1; j<=10; j++) {
				System.out.println("바보 : " + j);
				//if(j>4) break; //안쪽 포문만 종료
				if(j>4) break k;//label k 에 해당하는 반복문 종료
			}
			System.out.println("아님 : " + i);
		}
	}
}