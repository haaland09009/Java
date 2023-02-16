package ch03;

public class Sw1 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		switch (num) { // num에 들어온 숫자와 일치하는 case문으로 이동
		case 1 : System.out.println("1입니다."); break;
		case 2 : System.out.println("2입니다."); break;
		case 3 : System.out.println("3입니다."); break;
		case 4 : System.out.println("4입니다."); break;
		default : System.out.println("나머지 숫자입니다.");
		}
	}

}
