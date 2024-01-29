package ex07_static;

public class staticTest1 {
	double pi = 3.14159;
	
	int plus(int x, int y) {
		return x + y;
	}
	
	int minus(int x, int y) {
		return x - y;
	}
	/*
	 * plus 나 minus에서 멤버변수나 멤버함수를 사용하지 않고 리턴하고 있음
	 * 만약 plus를 사용한다고 가정했을때
	 * staticTest1 t = new statictest1();로 객체를 생성해서 사용해야함
	 * 하지만 이렇게 객체를 생성하게 되면 생성자에 의해 stack에는 t라는 4바이트의 참조메모리가 생기게 되고
	 * heap에는 RC등의 메모리 공간을 만들려고 하기 떄문에 오버헤드가 발생됨
	 * 따라서 모든 객체가 공유할 수 있는 static을 사용한다.
	 * 
	 * static은 this 키워드를 사용할 수 없다.
	 * 
	 */
}

