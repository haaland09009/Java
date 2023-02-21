package ch0217;

public class For6 {

	public static void main(String[] args) {
		

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=1; k<=5; k++) {
			for(int s=5; s>=k; s--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
