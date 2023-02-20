package ch04;

public class Ex03 {
	public static void main(String[] args) {
//		거스름돈 327000을 50000, 10000, 5000, 1000짜리 동전으로 줄때 몇개씩 주어야 하나요?
		int[] arr = {50000, 10000, 5000, 1000};
		int[] count = new int[4];
		int money = 327000;
		for(int i = 0; i < arr.length; i++)
		{
			count[i] = money / arr[i];
			money = money % arr[i];
		}
		
		for(int i = 0; i < count.length; i++)
		{
			System.out.println(arr[i] + "원짜리 동전은 " + count[i] + "개 필요합니다.");
		}
	

	}

}
