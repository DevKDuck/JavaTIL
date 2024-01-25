package ex05_reference;

import java.util.Scanner;


public class generalizationTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//특별화
		System.out.println("특별화: 10 + 20 = 30");
		
		/*
		 일반화
		 1. 입력 받는 일반화
		 2. argument를 이용한 일반화
		 */
		
		
		//직접 입력 받는 일반화
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int a = Integer.parseInt(str);
		
		str = scanner.nextLine();
		int b = Integer.parseInt(str);
		System.out.println(a + " + " + b + " = " + (a + b));
		
		
		//argument를 이용한 일반화
		
		int c = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		System.out.println(c + " + " + d + " = " + (c + d));
		
		
		
	}

}
