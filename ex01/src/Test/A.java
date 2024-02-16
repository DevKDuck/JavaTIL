package Test;

public class A {
	private int field1;

	void method1() {
		System.out.println("testGit클래스의 멤버메서드 method1()");
	}

	static int field2;

	static void method2() {
		System.out.println("testGit클래스의 정적메서드 method2()");

	}

	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 20;
			method2();
		}
	}
	
	static class C{
		void method() {
//			field1 = 20;
//			method1();\\
		}
	}

}
