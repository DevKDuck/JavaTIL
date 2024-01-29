package week1;

public class Lotto {

	public static void main(String[] args) {
		
		//뽑은 인덱스에 채워 넣는 방식으로 다시 해보기
		
		int [] arr = new int[45];
		
		
		//초기화에 대한 책임 -> 함수로 빼야함(단일 책임 원칙)
		for (int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
				
		int [] result = new int [6];
		
		//구슬을 뽑는 책임 -> 함수로 빼야함 (단일 책임 원칙)
		for(int i=0;i<6;++i) {
			int idx = (int)(Math.random()*(arr.length - i));
			result[i] = arr[idx];
			arr[idx] = arr[arr.length - 1 - i];
		}
		
		for (int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		//false로 이루어진 45개 볼 
//		boolean [] ball = new boolean[45];
//
//		int[] winningNum = new int[6];
//
//		int count = 0;
//		
//
//		while (true) {
//			//1~45 랜덤 수
//			int randomNum = ((int)(Math.random()*45)+1);
//			
//			if (ball[randomNum - 1] == false) {
//				ball[randomNum - 1] = true;
//				winningNum[count] = randomNum;
//				System.out.println(randomNum);
//				count += 1;
//			}
//			
//			if (count >= 6){
//				return;
//			}
//			
//		}
	}

}
