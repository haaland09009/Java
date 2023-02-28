package ch09;

import java.util.Calendar;
import java.util.Date;

public class Cal1 {
	public static void main(String[] args) {
//		 추상클래스이면서 생성자가 protected
//		 월은 0부터 시작하여 11로 끝나서 1을 더해줘야 한다.
		Calendar cal = Calendar.getInstance(); // new Calendar();는 불가능 -> 에러 발생
		System.out.printf("오늘은 %d년 %d월 %d일입니다\n", 
				cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 이 달 중에 며칠째
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // 일년중에 며칠째, 1월 31 + 2월 28 = 59
		Date date = new Date();
		System.out.println(date);
	}

}
