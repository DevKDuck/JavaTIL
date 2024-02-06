package ExceptionHandling;


//ExceptionHandlingExample1 try catch finally를 이용하여 예외 처리
public class ExceptionHandlingExample2 {

	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수: " + result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
		} finally {
			System.out.println("마무리");
		}
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
	 * 마무리
	 * Cannot invoke "String.length()" because "data" is null 
	 * 마무리
	 * 종료
	 * 
	 */
}
