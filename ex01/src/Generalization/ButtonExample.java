package Generalization;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOK = new Button();

		// OK 버튼 클릭 이벤트를 처리하는 로컬 클래스
		class OKListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		}

		// OK 버튼 객체에 ClickListener 구현 객체 주입
		btnOK.setClickListener(new OKListener());

		// OK버튼 클릭
		btnOK.click();

		Button btnCancel = new Button();

		// OK 버튼 클릭 이벤트를 처리하는 로컬 클래스
		class CancelListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		
		//마찬가지로 Cancel 버튼 객체에 ClickListener구현 객체 주입
		btnCancel.setClickListener(new CancelListener());
		
		btnCancel.click();
	}

}
