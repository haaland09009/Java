package ch09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

// GregorianCalendar 이용하여 2023 03 03 01:30:20 객체 생성 -> 년 2자리- 월 2자리 - 일 2자리 / 시(24):분:초
// (요일) 년 4자리/월/일 (오전/오후) 12시:분:초
public class SimpleDate2 {
	public static void main(String[] args) { // 월은 0부터
		GregorianCalendar gc = new GregorianCalendar(2023,2,3,1,30,20);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd HH:dd:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("(E)yyyy/MM/dd (a)hh:dd:ss");
		Date date = gc.getTime();
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		
		
	}

}
