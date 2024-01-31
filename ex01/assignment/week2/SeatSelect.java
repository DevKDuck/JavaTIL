package week2;

import java.util.Scanner;

public class SeatSelect {
	int[] arr = new int[18];
	int[] result = new int[18];
	static int count = 0;

	//arr인덱스 값 초기화
	SeatSelect() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
	}
	
	//자리뽑기
	void selectSeat(String name) {

		final int idx = (int)(Math.random()*(arr.length - count));
		result[count] = arr[idx];
		arr[idx] = arr[arr.length - 1 - count];
		printSeat(name, result[count]);
	}
	
	//출력
	void printSeat(String name, int seat) {
		System.out.println(name + "님은" + seat + "번 자리입니다.");
	}
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		SeatSelect s = new SeatSelect();
		
		while (count < 18) {
			String str = sc.next();

			s.selectSeat(str);
			count += 1;
		}
	}
}
