package ex03_ex04;

public class ForLoopTest1 {

	public static void main(String[] args) {
		//LoopTest 3번문제
		
		int sum = 0;
		for (int i=1; i<=100; i++){
			if (i%3 == 0) {
				sum += i;
				System.out.println("i: " + i + "sum: " + sum);
			}
		}

	}

}
