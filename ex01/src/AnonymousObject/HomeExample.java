package AnonymousObject;

public class HomeExample {

	public static void main(String[] args) {
		//Home 객체 생성
		Home home = new Home();
		
		home.use1();
		
		
		home.use2();
		
		
		home.use3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("난방을 켜다");
			}

			@Override
			public void turnOff() {
				System.out.println("난방을 끄다");
			}
			
		});
	}

}
