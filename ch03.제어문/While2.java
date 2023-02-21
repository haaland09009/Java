package ch0217;

public class While2 {

	public static void main(String[] args) {
		int i = 0, sum = 0;
		//while 문을 사용 1-10까지 합
		while(i<=10) {
			sum +=i;
			System.out.println(sum);
			i++;
		}
		System.out.println(sum);
	}
}
