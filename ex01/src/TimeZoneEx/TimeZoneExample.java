package TimeZoneEx;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Seoul");
		Calendar now = Calendar.getInstance(timeZone);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}
		else{
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
		
		
		//사용가능한  ID 확인하는 방법
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id: availableIDs) {
			System.out.println(id);
		}

	}

}
