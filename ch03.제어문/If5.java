package ch03;

public class If5 {
	public static void main(String[] args) {
		int money = Integer.parseInt(args[0]);
		String result = "";
		
		if (money >= 1000000)                                                                                                                                                  
			result = "비행기 타세요";
		else if (money >= 100000)
			result = "KTX 타세요";
		else if (money >= 50000)
			result = "택시 타세요";	
		else if (money >= 1000)
			result = "버스 타세요";
		else 
			result = "걸어가";
		System.out.printf("현재 가지고 있는 돈은 %d원이므로 %s",money ,result);
	}

}
