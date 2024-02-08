package ConfirmTest12;

public class StringBuilderExample {

	public static void main(String[] args) {
	
		String data = new StringBuilder()
			
				.append("")
				.toString();
		
		

		
		System.out.println("StringBuilder를 이용한 값: " + data);
		
		
		
		String str = "";
		for(int i=1; i<=100;i++) {
			str += i;
		}
		System.out.println("반복문을 이용한 값: " + str);
	}

}
