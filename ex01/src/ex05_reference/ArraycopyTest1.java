package ex05_reference;

public class ArraycopyTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] oldIntArray = new int[5000];
		int[] newIntArray = new int[10000];
		
		//nanoTime은 어셈블리언어임 -> Java가 아닌 c
		//native로 만들어짐
		//array크기가 작으면 자바가 더빠름
		long tick = System.nanoTime();
		for(int i=0; i<oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		tick =System.nanoTime() - tick;
		System.out.println("실행시간: " + tick);
		
	
		//arraycopy도 c언어임 memcopy라는 함수임
		tick =System.nanoTime();
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		tick =System.nanoTime() - tick;
		System.out.println("arraycopy실행시간: " + tick);
	
		//실행시간: 63100
//		arraycopy실행시간: 5700

	}

}
