package ex05_reference;

public class ArrayRefTest2 {

	public static void printArray(int[] scores) {
		for (int i = 0; i < scores.length; ++i) {
			System.out.println("점수[" + i + "] = " + scores[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2차원 배열
		int[][] arr2 = { { 10, 20, 30, 40 }, { 60, 70, 80, 90 } };

		//행열이 같지 않은 2차원 배열
		int[][] score = { { 80, 90, 96 }, { 76, 88 } };

		for (int i = 0; i < arr2.length; ++i) {
			for (int j = 0; j < arr2[i].length; ++j) {
				System.out.println(arr2[i][j]);
			}
		}
		
		//메모리 2x3 만듬
		int [][] mathScores = new int[2][3];
		
		
		//가변배열
		//조각조각 단편화가 생겨 좋지 않음
		
		int[][] englishScores = new int[2][]; 
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		// 리팩토링해서 메소드 추출

	}

}
