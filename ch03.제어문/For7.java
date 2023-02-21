package ch0217;

public class For7 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}			
			for(int q=0; q<5; q++) {
				for(int e=0; e<q; e++) {
				System.out.print(" ");

			}
				for(int w=4; w>=q; w--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
