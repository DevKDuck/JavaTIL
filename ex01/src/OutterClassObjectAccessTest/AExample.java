package OutterClassObjectAccessTest;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.field);
		a.method();
		
		a.useB();
	}

}
