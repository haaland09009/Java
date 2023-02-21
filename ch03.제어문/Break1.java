package ch0217;

public class Break1 {
	public static void main(String[] args) {
		
		int sum = 0, i = 1;
		while(true) {
			sum += i;
			i++;
			if(i>50) break;
		}
		System.out.println("50까지 합 : " + sum);
	}
}