package ex08_Interface;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		//rc 변수에 Television 객체 대입
		rc = new Television();
		rc.turnOn();
		
		//rc 변수에 Audio 객체 대입(교체)
		rc = new Audio();
		rc.turnOn();

	}

}
