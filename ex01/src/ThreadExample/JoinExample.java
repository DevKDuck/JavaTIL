package ThreadExample;

public class JoinExample {
	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		
		//main스래드에서 sum 스레드 .join 메서드를 호출했으므로 sum쓰레드가 종료될때까지 기다렸다가 main스레드를 실행
		
		//join을 호출한  스레드가 끝날때까지 main 스레드가 대기 상테
		try {
			sumThread.join();
		}
		catch (InterruptedException e) {
		}
		
		//메인 스레드
		System.out.println("1~100 합: " + sumThread.getSum());
		
		/*
		 * 출력해보면 메인 스레드에서 출력할때 작업스레드도 동작하고 있어서 5050이 나오지 않음
		 * 상대방 스레드가 언제 끝나는지 모르기 때문에 그럼
		 * 그래서 join 함수가 필요함
		 */
	}
}
