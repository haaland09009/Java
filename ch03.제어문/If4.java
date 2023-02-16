package ch03;

public class If4 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
//		한줄만 사용하면 중괄호 셍략
		if (score >= 90)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else 
			grade = "권총";
		
		System.out.printf("점수: %d, 학점: %s", score, grade);

	}

}
