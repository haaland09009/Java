package ch0217;

public class Test3 {
	public static void main(String[] args) {
		//주사위를 던져서 두수의 합이 6이 되는 경우를 출력
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6)
					System.out.printf("%d + %d = %d\n", i, j, i+j);
			}
		}
		
		 int a = 0;
		 int b = 0;
		
		 while(true) {
			 a = (int)(Math.random()*6) + 1;
			 b = (int)(Math.random()*6) + 1;
			 System.out.printf("(%d, %d)\n", a, b);
			 int sum = a + b;
			 if(sum == 6) break;
		 }
	}
}