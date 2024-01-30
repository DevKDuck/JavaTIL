package Refactoring_Account;

import java.util.Scanner;

public class BankApplication {
    static Account[] accounts = new Account[100];
    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while(run){
            displayMenu();

            String choice = sc.next();

            switch(choice){
                case "1":
                	insertAccount();
                    break;
                case "2":
                	printAccounts();
                    break;
                case "3":
                    System.out.println("------");
                    System.out.println("예금");
                    System.out.println("------");
                    System.out.print("계좌번호: ");
                    String bankaccountSelect = sc.next();
                    for(int i = 0; i< num; ++i){
                        if(accounts[i].getBankaccount().equals(bankaccountSelect)){
                            System.out.print("예금액: ");
                            int addAmount = sc.nextInt();
                            int amount = accounts[i].getAmount() + addAmount;
                            accounts[i].setAmount(amount);
                        } else {
                            System.out.println("계좌를 다시 확인해주세요.");
                        }
                        break;
                    }
                    break;
                case "4":
                    System.out.println("-----");
                    System.out.println("출금");
                    System.out.println("-----");
                    System.out.print("계좌번호: ");
                    String bankaccountSelect2 = sc.next();
                    for(int i = 0; i< num; ++i){
                        if(accounts[i].getBankaccount().equals(bankaccountSelect2)){
                            System.out.print("출금액: ");
                            int addAmount = sc.nextInt();
                            int amount = accounts[i].getAmount() - addAmount;
                            accounts[i].setAmount(amount);
                            System.out.println("결과 : 출금이 성공되었습니다.");
                        } else {
                            System.out.println("계좌를 다시 확인해주세요.");
                        }
                        break;
                    }
                    break;
                case "5":
                    run = false;
                    System.out.println("프로그램 종료");
            }
        }
    }

	public static void printAccounts() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		
		for(int i = 0; i < num; ++i){
		    accounts[i].print();
		}
	}

	public static void insertAccount() {
		System.out.println("-------");
		System.out.println("계좌 생성");
		System.out.println("-------");
		
		System.out.print("계좌번호: ");   String bankaccount  = sc.next();
		System.out.print("계좌주: ");     String accountholde = sc.next();
		System.out.print("초기입금액: "); int amount = sc.nextInt();
		
		accounts[num++] = new Account(bankaccount, accountholde, amount);
	}

	public static void displayMenu() {
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택> ");
	}
}
