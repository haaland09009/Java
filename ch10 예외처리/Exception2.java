package ch10;

public class Exception2 {
	public static void main(String[] args) {
		int number = 100, result = 0;
		for(int i = 0; i < 10; i++) {
			int ran = (int)(Math.random()*10); // 0 ~ 9
				result = number / ran; 
				System.out.printf("%d / %d = %d\n" , number, ran, result);
		
		}	
	}
}
