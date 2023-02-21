package ch0217;

public class Continue2 {
	public static void main(String[] args) {
		
		k : for(int i=0; i<10; i++) {
			for(int j=1; j<10; j++) {
			System.out.println("안녕 : " + j);
			if(j>3) continue k;
			System.out.println("대박 : " + j);
			}
			System.out.println("바깥 : " + i);
		}
	}
}