package ex01;

public class CastingExample {
	public static void main(String[] args) {
		int var1 = 10;
		byte var2 = (byte) var1;
		System.out.println(var2);	 //강제 타입 변환 후에 10이 그대로 유지

		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);	 //강제 타입 변환 후에 300이 그대로 유지

		int var5 = 65;
		char var6 = (char) var5;
		System.out.println(var6); 	//'A'가 출력

		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8); 	//3이 출력
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		s1 = s1 + "World";
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		
		//MARK: 문자열 상수는 변경되지 않는다. replace메서드로 바꿔도 복사본을 만드는 것이다.
		s2 = s1.replace("o", "a");
		System.out.println();
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		//명시적으로 제거 해 줄 수 있음
		s1 = s2 = null; 
	}
}