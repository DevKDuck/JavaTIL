package promotion;

public class Child extends Parent {
	//컴파일 오류를 확인하기 위해 작성 오버라이드(Parent에 메서드가 존재하는 지)
	
	@Override
	public void method2() {
		System.out.println("child method2");
	}
	
	public void method3() {
		System.out.println("child method3");
	}
}
