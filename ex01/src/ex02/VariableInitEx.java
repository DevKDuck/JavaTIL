package ex02;

public class VariableInitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		
		
		
		//MARK: x,y change
		int x = 3;
		int y = 5;
		
		int temp = y;
		y = x;
		x = temp;
		System.out.println("x = " + x + ", y = " + y);
		
	}

}
