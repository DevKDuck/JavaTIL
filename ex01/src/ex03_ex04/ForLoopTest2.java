package ex03_ex04;

public class ForLoopTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x=0; x<=10; x++) {
			for (int y=0; y<=10; y++) {
				int sum = (4 * x) + (y * 5);
				if(sum == 60) {
					System.out.println("x: " + x + " y: " + y);
				}
			}
		}
	}

}
