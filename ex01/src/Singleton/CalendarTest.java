package Singleton;

import java.util.Calendar;

public class CalendarTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Calendar는 Singleton으로 만들어져 이어 객체가 하나이고,
		//추가 생성이 불가능함
//		Calendar calendar = new Calendar();
		
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH)+1);
	}

}
