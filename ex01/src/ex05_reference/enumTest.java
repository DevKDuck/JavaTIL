package ex05_reference;

import java.util.Calendar;

public class enumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Weekends 열겨형 자료형 변수 선언
		Weekends today = null;

		// Calendar 객체를 얻어 변수에 대입
		Calendar cal = Calendar.getInstance();

		// week 1~7
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week);

		switch(week) {
		case 1: today = Weekends.SUNDAY ; break;
		case 2: today = Weekends.MONDAY ; break;
		case 3: today = Weekends.TUESDAY ; break;
		case 4: today = Weekends.WEDNESDAY ; break;
		case 5: today = Weekends.THURSDAY ; break;
		case 6: today = Weekends.FRIDAY ; break;
		case 7: today = Weekends.SATURDAY ; break;
	}
	

		if (today == Weekends.SATURDAY){
			System.out.println("목요일입니다.");
		}else {
			System.out.println("목요일이 아닙니다..");
		}

	}

}
