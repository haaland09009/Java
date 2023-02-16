package ch03;

public class test1 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String msg;
		if (n < 10)
			msg = "10미만의 값입니다.";
		else if (n < 100) 
			msg = "10 이상 100미만의 값입니다.";
		else if (n < 1000) 
			msg = "100 이상 100미만의 값입니다.";
		else 
			msg = "1000이상의 값입니다.";
		System.out.println(msg);
	}

}
