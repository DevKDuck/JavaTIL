package ex03_ex04;

import java.util.Scanner;

public class WhileLoopTest2 {

	public static void main(String[] args) {
		//LoopTest 7번문제
		

		Scanner scanner = new Scanner(System.in);

		int sum = 0;

		boolean run = true;

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1. 예금 2.출금 3.잔고 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");

			String str = scanner.nextLine();

			switch (str) {
			case "1" -> {
				System.out.print("예금액 >");
				String howmany = scanner.nextLine();
				sum += Integer.parseInt(howmany);
				System.out.println("잔액 > " + sum);
			}

			case "2" -> {
				System.out.print("출금액 >");
				String howmany = scanner.nextLine();
				sum -= Integer.parseInt(howmany);
				System.out.println("잔액>" + howmany);
			}

			case "3" -> {
				System.out.println("잔고>" + sum);
			}

			case "4" -> {
				System.out.println("프로그램 종료");
				run = false;

			}

			}

		}

	}

}
