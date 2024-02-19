package ThreadExample;

public class ThreadNameExample {

	public static void main(String[] args) {
		
		//currentThread로 스레드 객체의 참조를 얻음
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");

		for(int i=0; i<3; i++) {
			Thread threadA = new Thread(() -> {
				//getName 메서드는 스레드의 인스턴스 메소드로 스레드의 이름을 리턴
				System.out.println(Thread.currentThread().getName()+ "실행");
			});
			threadA.start();
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		chatThread.setName("chat-thread");
		chatThread.start();
	}

}
