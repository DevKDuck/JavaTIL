package ex06Account;

import java.util.Scanner;

public class BankApplication {
	static Account[] accountArr = new Account[100];
	static int count = 0;
	static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		

		while (true) {
			displayMenu();
			
			String str = scanner.nextLine();
			
			switch (str) {
			case "1":
				count = insertAccount(accountArr, scanner, count);
				break;
			case "2":
				printAccounts(accountArr, count);
				break;
			case "3":
				System.out.println("-------------------");
				System.out.println("예금");
				System.out.println("-------------------");
				System.out.print("계좌번호: ");
				String str5 = scanner.nextLine();
				System.out.print("예금액: ");
				String str6 = scanner.nextLine();
				for (int l = 0; l < count; l++) {
					if (accountArr[l].accountNum == str5) {
						accountArr[l].balance = accountArr[l].balance + Integer.parseInt(str6);
						return;
					}
				}
				
				
				break;
			case "4":
				System.out.println("-------------------");
				System.out.println("출금");
				System.out.println("-------------------");
				System.out.print("계좌번호: ");
				String str7 = scanner.nextLine();
				System.out.print("출금액\1: ");
				String str8 = scanner.nextLine();
				for (int l = 0; l < count; l++) {
					if (accountArr[l].accountNum == str7) {
						accountArr[l].balance -= Integer.parseInt(str8);
						System.out.println("결과: 출금이 성공되었습니다.");
						return;
					}
				}
				break;
			case "5":
				System.out.println("프로그램 종료");
				return;
			default:
				break;

			}

		}

	}

	private static void printAccounts(Account[] accountArr, int count) {
		System.out.println("-------------------");
		System.out.println("계좌목록");
		System.out.println("-------------------");
		for (int l = 0; l < count; l++) {
			System.out.println(accountArr[l].accountNum + " " + accountArr[l].name + " " + accountArr[l].balance);
		}
	}

	private static int insertAccount(Account[] accountArr, Scanner scanner, int count) {
		System.out.println("-------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------");
		System.out.print("계좌번호: ");
		String str2 = scanner.nextLine();
		System.out.print("계좌주: ");
		String str3 = scanner.nextLine();
		System.out.print("초기입금액: ");
		String str4 = scanner.nextLine();
		int i = Integer.parseInt(str4);
		Account account = new Account(str2, str3, i);
		accountArr[count++] = account;
		System.out.print("결과: 계좌가 생성되었습니다.");
		return count;
	}

	private static void displayMenu() {
		System.out.println("---------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("---------------------------------------------");
		System.out.print("선택> ");
	}

}
