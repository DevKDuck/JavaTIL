package ex08_TestNum08;

public class Example {
	
	public static void action(A a) {
		a.method1();
		if (a instanceof C c){
			c.method2();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(new B());
		action(new C());
	}

}
