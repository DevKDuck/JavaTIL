package ex05_reference;

public class ArrayRefTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = {10,20,30,40,50,60,70,80,90,100}; //초기화
		int[] score2 = null;
		int[] score3 = new int[] {10,20,30,40,50,60,70,80,90,100}; 
		//new에 의해 별도의 메모리에 할당됨
		//위 코드는 초기화 및 대입시 사용 가능
		//위 코드는 대입시 사용할 수 있기 때문에 메솓드의 인자로 전달할 수 있음
		
		
		//기본값의 경우 초기값이 0, 10000개 짜리 배열생성
		int [] score4 = new int[10000];
		System.out.println(score4[10]);
		
		//참조값의 경우 null
		String [] str = new String[10];
		System.out.println(str[3]);
		
		
		//length를 이용하여 배열의 길이 (읽기만 가능)
		System.out.println(score4.length); //10000
		System.out.println(str.length); //10
		
		//배열에 값을 기록
		for (int i=0;i<score4.length;++i) {
			score4[i] = i*10;
		}
		
		//배열에 값을 읽기
		for (int i=0;i<score4.length;++i) {
			System.out.println(score4[i]);
		}
		
		for (int i=0;i<score4.length;++i) {
			score4[i] = i*10;
		}
		
		//읽기 쓰기를 한번에 하는 코드
		for (int i=0;i<score4.length;++i) {
			System.out.println(score4[i]);
			score4[i] = i*10;
			//한번에 하면 좋지 않아! 기능은 한가지만
		}
		
		
	}

}
