package ConfirmTest12;

public class NanoExample {

	public static void main(String[] args) {
		
		
		//시작 시간
		long time1 = System.nanoTime();
		
		
		//실행시작
		int[] scores = new int[1000];
		for(int i=0; i<scores.length;i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score: scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);

		//끝나는 시간
		long time2 = System.nanoTime();
		
		//수행 시간
		System.out.println(time2 - time1);
	}

}
