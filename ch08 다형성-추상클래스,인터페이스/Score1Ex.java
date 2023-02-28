package ch08;
//  4장에 있는 amount1.java 파일 복사해서 바꿔해보기
public class Score1Ex {
	public static void main(String[] args) {
		String subject = "성적표"; int len = 54;
		String[] name = {"블랙핑크", "뉴진스", "BTS", "아이유", "아이브"};
		String[] title = {"이름", "국어", "영어", "수학","과학", "총점", "평균"};
		int score[][] = {{90,85,76,88},
						{88,77,92,55},
						{93,84,69,77},
						{78,86,92,58},
						{34,99,66,91}};
		ScoreCal sc = new ScoreCal(subject, name, title,score, len);
		sc.print();
	}

}
