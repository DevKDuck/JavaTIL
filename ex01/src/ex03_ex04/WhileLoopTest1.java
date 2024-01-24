package ex03_ex04;

public class WhileLoopTest1 {

	public static void main(String[] args) {
		//LoopTest 4번문제
		
		
		
		while(true) {
			
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			int sum = a + b;
			
			if (sum == 5){
				System.out.println(a);
				System.out.println(b);
				break;
			}
		}
	}

}
