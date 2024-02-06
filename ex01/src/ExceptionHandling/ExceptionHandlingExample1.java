package ExceptionHandling;

public class ExceptionHandlingExample1 {

	// String 자료형 data의 길이를 반환하는 정적함수
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: " + result);
	}

	public static void main(String[] args) {
		System.out.println("시작");
		printLength("문자열은 되니??");
		printLength(null);
		System.out.println("종료");
	}
	/*
	 * 시작 
	 * 문자 수: 9 
	 * Exception in thread "main" java.lang.NullPointerException:
	 *  Cannot invoke "String.length()" because "data" is null at
	 * ExceptionHandling.ExceptionHandlingExample1.printLength(
	 * ExceptionHandlingExample1.java:7) at
	 * ExceptionHandling.ExceptionHandlingExample1.main(ExceptionHandlingExample1.
	 * java:14)
	 * 
	 */
	
	//예외부터는 JVM이 Run 하지 않는것을 볼 수 있음

}
