package CalendarEx;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// Calendar는 추상클래스로 객체생성 대신 정적사용
		Calendar now = Calendar.getInstance();

		
		//Calendar의 get메서드를 이용해 년,월,날짜,주,오전,오후,시간 
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "월";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "월";
			break;
		case Calendar.THURSDAY:
			strWeek = "월";
			break;
		case Calendar.FRIDAY:
			strWeek = "월";
			break;
		case Calendar.SATURDAY:
			strWeek = "월";
			break;
		default:
			strWeek = "일";
		}
		
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}
		else {
			strAmPm = "오후";
		}

		
		int hour = now.get(Calendar.HOUR);
		int minutes = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(strWeek + "요일");
		System.out.println(strAmPm + " ");
		System.out.println(hour + "시");
		System.out.println(minutes + "분");
		System.out.println(second + "초");
	}
}
