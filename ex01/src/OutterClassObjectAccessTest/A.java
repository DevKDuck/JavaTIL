package OutterClassObjectAccessTest;

public class A {
	String field = "A클래스 String 자료형 참조변수명:field인 필드";
	
	void method() {
		System.out.println("A클래스의 method()실행");
	}
	
	
	class B{
		String field = "A의 인스턴스 멤버 클래스 B의 String 자료형 참조변수명:field인 필드";
		
		void method() {
			System.out.println("B클래스의 method()실행");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(A.this.field);
			A.this.method();
		}
	}
	
	void useB() {
		B b = new B();
		b.print();
	}
}
