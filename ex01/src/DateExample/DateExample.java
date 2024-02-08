package DateExample;

import java.text.*;
import java.util.*;

public class DateExample {

	public static void main(String[] args) {
		
		//Date객체 만들어서 toString으로 바꾸기
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		
		//SimpleDateFormat을 이용하여 포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
