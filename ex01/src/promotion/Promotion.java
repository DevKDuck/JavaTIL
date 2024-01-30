package promotion;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자식 객체 생성
		Child child = new Child();
		child.method2();
		child.method3();
		
		//부모 객체 생성
		Parent parent = new Parent();
		parent.method1();
		parent.method2();
		
		//child의 참조주소를 쳐다보도록 타입 변환
		parent = child;
		
		parent.method1();
		parent.method2();
		//parent.method3(); 호출 불가능
	}

}
