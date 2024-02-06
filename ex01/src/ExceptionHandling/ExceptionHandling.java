package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println();

		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// ClassPath에서 주어진 클래스를 찾는 코드 Class.forName();

		/*
		 * java.lang.String 클래스가 존재합니다.
		 * 
		 * java.lang.ClassNotFoundException: java.lang.String2 at
		 * java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader
		 * .java:641) at
		 * java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(
		 * ClassLoaders.java:188) at
		 * java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525) at
		 * java.base/java.lang.Class.forName0(Native Method) at
		 * java.base/java.lang.Class.forName(Class.java:375) at
		 * ExceptionHandling.ExceptionHandling.main(ExceptionHandling.java:17)
		 */

		System.out.println();

		try {
			Class.forName("java.lang.String3");
			System.out.println("java.lang.String3 클래스가 존재합니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과:" + e.getMessage());
		}

		catch (ClassNotFoundException e) {
			System.out.println("클래스를 경로에서 찾을 수 없다:" + e.getMessage());
		}

		//여러개 예외 종류에 따를 처리
		/*
		 * java.lang.String 클래스가 존재합니다.
		 * 
		 * java.lang.ClassNotFoundException: java.lang.String2 at
		 * java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader
		 * .java:641) at
		 * java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(
		 * ClassLoaders.java:188) at
		 * java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525) at
		 * java.base/java.lang.Class.forName0(Native Method) at
		 * java.base/java.lang.Class.forName(Class.java:375) at
		 * ExceptionHandling.ExceptionHandling.main(ExceptionHandling.java:16)
		 * 
		 * 클래스를 경로에서 찾을 수 없다:java.lang.String3
		 * 
		 */
		
		
		
// 상위 클래스 catch블록이 먼저 검사 대상이 되면 안됨
//		try {
//			Class.forName("java.lang.String3");
//			System.out.println("java.lang.String3 클래스가 존재합니다.");
//		} catch (Exception e) {
//			System.out.println("배열 인덱스 초과:" + e.getMessage());
//		}
//
//		catch (ClassNotFoundException e) {
//			System.out.println("클래스를 경로에서 찾을 수 없다:" + e.getMessage());
//		}
	}

}
