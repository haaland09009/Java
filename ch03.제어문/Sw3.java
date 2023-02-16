package ch03;

public class Sw3 {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "겨울입니다.";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄입니다.";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름입니다.";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을입니다.";
			break;
		default: 
			season = "존재하지 않습니다.";
		}
		System.out.println(month + "월의 계절은 " + season );
	}

}
