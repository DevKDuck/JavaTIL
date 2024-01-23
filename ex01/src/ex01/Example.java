package ex01;

public class Example {
	public static void main(String[] args) {
		System.out.println("args.length = " + args.length);
		if(args.length >= 1) System.out.println("args[0] = " + args[0]);
		if(args.length >= 2) System.out.println("args[1] = " + args[1]);
		if(args.length >= 2) {
			int result = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			System.out.println("result = " + (args[0] + args[1]));
			
			//문자열을 파싱해서 변수를 초기화해서 사용하는 경우
			System.out.println("result = " + result);
			//valueof메서드가 더 속도가빠름
			System.out.println("result = " + String.valueOf(result));
			//String str = "" + result;
			String str = String.valueOf(result);
			System.out.println("str = " + str);
		}
		
	}
}