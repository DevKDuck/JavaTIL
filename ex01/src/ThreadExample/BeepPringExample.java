package ThreadExample;

import java.awt.Toolkit;

public class BeepPringExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

//		//beep 소리가 먼저 0.5초마다 1번씩 5번 나고 끝나고 띵이 출력됨
//		for(int i=0; i<5; i++) {
//			toolkit.beep();
//			try {
//				Thread.sleep(500);
//			}
//			catch(Exception e) {
//				
//			}	
//		}
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("띵");
//			try { Thread.sleep(500); } catch(Exception e) {}
//		}

		
		//Thread를 새로 만들어서 재정의함
		//thread라는 스레드와 메인 스레드가 같이 실행됨
		
		//Thread thread = new Thread()형식으로 참조변수를 만들어 사용할 수도 있음
		//근데 Runnable 인터페이스를 상속해서 사용하는게 좋음
		
		//익명 객체를 이용하여 객체를 매개값으로 사용한 case
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		});
		
		//작업스레드를 실행할때
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		
	
	}

}
