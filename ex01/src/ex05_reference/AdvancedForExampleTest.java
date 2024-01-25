package ex05_reference;

public class AdvancedForExampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 무조건 모든 데이터에 대해서 동일한 작업을 진행할 떄사용한다.

		int[] scores = { 95, 71, 54, 93, 87 };

		// 이렇게 모든 데이터에 대해서 동일한 작업을 진행할때 다음과 같이 쓰는 코드는 옛날방식이다.
		int sum = 0;
//		for (int i=0; i<scores.length;++i) {
//			sum = sum + scores[i];
//		}
//		
		sum = 0;

		// 이렇게 쓰는게 좋다.
		//배열 데이터를 다 access할때는 이것을 써라!!
		//그래야 오류가 작아져

		for (int score : scores) {
			sum = sum + score;
		}

		System.out.println(sum);

		
		
		//만약에 모든데이터에 대해서 동일한  작업을 하는게 아니면 향상된 for 루프를 쓰면안된다
		//왜???? 어짜피 모든 데이터를 접근하기 때문이야
		int i = 0;
		for (final int score : scores) {
			//score = 100 * score; 지역변수를 쓸때 final을 사용하자
			if (i % 2 == 0) {
				sum = sum + score;
			}
			i++;
		}

		//그에 반해서 for문은 조건에서만 데이터에 접근하게 됨
		//조건에 대한 처리는 이게 맞아
		for (int j = 0; j < scores.length; ++j) {
			if (j % 2 == 0) {
				sum = sum + scores[i];
			}
		}

	}

}
