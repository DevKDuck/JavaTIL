package week1;

public class Lotto {

	public static void main(String[] args) {
		
		//false로 이루어진 45개 볼 
		boolean [] ball = new boolean[45];

		int[] winningNum = new int[6];

		int count = 0;
		

		while (true) {
			//1~45 랜덤 수
			int randomNum = ((int)(Math.random()*45)+1);
			
			if (ball[randomNum - 1] == false) {
				ball[randomNum - 1] = true;
				winningNum[count] = randomNum;
				System.out.println(randomNum);
				count += 1;
			}
			
			if (count >= 6){
				return;
			}
			
		}
	}

}

