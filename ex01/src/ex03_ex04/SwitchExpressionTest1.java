package ex03_ex04;

public class SwitchExpressionTest1 {

	public static void main(String[] args) {
		// Loop Test 2번문제

		String grade = "B";
		int score1 = 0;
		switch (grade) {
		case "A" -> {
			score1 = 100;
		}
		case "B" -> {
			int result = 100 - 20;
			score1 = result;
		}

		default -> {
			score1 = 60;
		}
		}
		System.out.println(score1);
	}
}
