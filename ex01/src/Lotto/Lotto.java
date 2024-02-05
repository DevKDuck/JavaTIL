package Lotto;

public class Lotto {
	int [] arr = new int[45];
	int [] result = new int [6];
	
	Lotto() {
		for (int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
	}
	
	void assign() {
		for(int i=0;i<6;++i) {
			int idx = (int)(Math.random()*(arr.length - i));
			result[i] = arr[idx];
			arr[idx] = arr[arr.length - 1 - i];
		}
	}
	
	void printLotto() {
		for (int value: result) {
			System.out.println(value);
		}
	}

	public static void main(String[] args) {
		
		Lotto lotto = new Lotto();
		
		lotto.assign();
		
		lotto.printLotto();
		
		
		
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
