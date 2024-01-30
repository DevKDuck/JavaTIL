package ex07_protected;

public class ProtectedTest2 {
	public void method() {
	ProtectedTest test = new ProtectedTest();
	test.field = "";
	test.method();
	}
}
//같은 패키지(폴더)에서는 protected로 선언된 객체를 사용할 수 있다.