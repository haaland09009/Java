package ch06;

public class Fat1 {
	public static void main(String[] args) {
		int[] nums = {3,4,5,6,7};
		for(int num : nums) {
			System.out.println(num + "계승 : " + fat1(num));
		}
		System.out.println("=================");
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + "계승 : " + fat2(nums[i]));			
		}
	}

	private static int fat2(int num) { // recursive
		if (num == 1)
			return 1;
		else return num * fat2(--num);		
	}

	private static int fat1(int num) {
		int result = 1;
		for(int i = num; i > 0; i--) {
			result *= i;
		}
		return result;
	}

}
