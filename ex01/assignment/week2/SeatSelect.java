package week2;

import java.util.Scanner;

public class SeatSelect {
	int[] arr = new int[18];
	int[] result = new int[18];
	String[] nameArr = new String[18];

	static int count = 0;

	SeatSelect() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
	}

	void assign(String name) {
		int idx = selectSeat();
		result[count] = arr[idx];
		arr[idx] = arr[arr.length - 1 - count];
		printSeat(result[count], name);
	}

	int selectSeat() {
		int remainingSeats = arr.length - count;
		int idx = (int) (Math.random() * remainingSeats);
		for (int i = 0; i < count; i++) {
			if (result[i] == arr[idx]) {
				idx = (idx + 1) % remainingSeats;
				i = -1; // Reset to check from the beginning
			}
		}
		return idx;
	}

	void printSeat(int idx, String name) {

		System.out.println(name + "님은" + idx + "번째 자리입니다.");

	}

	public static void main(String[] args) {
	

		SeatSelect s = new SeatSelect();

		while (count < 18) {

			Scanner sc = new Scanner(System.in);
			String str = sc.next();

			s.assign(str);
			count += 1;
		}

	}

}
