package Generalization;

public class Button {

	// 중첩 인터페이스 선언
	public static interface ClickListener {
		void onClick();
	}

	// 필드
	private ClickListener clickListener;

	public void setClickListener(final ClickListener clickListener) {
		// this = 필드의 clcickListener, = clcickListener는 매개변수
		this.clickListener = clickListener;
	}

	public void click() {
		if (clickListener != null) {
			this.clickListener.onClick();
		}
	}
}
