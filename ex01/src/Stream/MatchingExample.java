package Stream;

import java.util.Arrays;

public class MatchingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = {2,4,6};
		
		boolean result1 = false;
		for (int v: intArr) {
			if(v % 2 == 0) {
				result1 = false;
				break;
			}
		}
		
		if (result1) {
			System.out.println("모든 값은 짝수 입니다.");
		}
		else {
			System.out.println("모든 값은 짝수가 아닙니다.");
		}
		
		
		
		
		/*  stream.allMatch를 이용해서 축약시킬 수 있음
		 * --------------------------------------------------
		 */
		
		
		boolean result2 =Arrays.stream(intArr).allMatch(a->a%2==0);
		
		if (result2) {
			System.out.println("모든 값은 짝수 입니다.");
		}
		else {
			System.out.println("모든 값은 짝수가 아닙니다.");
		}
		
		
		
		
		/*
		 * --------------------------------------------------
		 */
		result1 = false;
		for (int v: intArr) {
			if(v % 3 == 0) {
				result1 = true;
				break;
			}
		}
		
		if (result1) {
			System.out.println("배열에 3의 배수가 있습니다.");
		}
		else {
			System.out.println("배열에 3의 배수가 존재하지 않습니다.");
		}
		
		

		/*stream.allMatch를 이용해서 축약시킬 수 있음
		 * --------------------------------------------------
		 */
		
		boolean result3 =Arrays.stream(intArr).anyMatch(a->a%3==0);
		System.out.println("하나라도 3의 배수가 있는가?" + result3);
		

		boolean result4 =Arrays.stream(intArr).noneMatch(a->a%3==0);
		System.out.println("3의 배수가 없는가?" + result4);
		
		
		
	}

}
