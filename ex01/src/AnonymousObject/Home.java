package AnonymousObject;

public class Home {
	
	
	/* 익명 구현 객체
	 * 	new 인터페이스(){
	 * 	
	 * }
	 */
	
	
	//필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV 켜다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV 끄다.");
		}
	};
	
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	
	public void use2(){
		//로컬 변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("에어컨 켜다");
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨 끄다");
			}
			
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	//메소드(매개변수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOff();
		rc.turnOn();
	}

}
