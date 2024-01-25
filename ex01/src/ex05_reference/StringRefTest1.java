package ex05_reference;

public class StringRefTest1 {

	public static int sum(int end) {
		int sum = 0;
		for(int i=1;i<=end;i++) {
			sum += i;
		}
		return 0;
	}
	//변경되는 작업은 한곳에 모으는게 좋다
	//함수의 루틴은 5줄이 적당, 10줄이상은 별로 좋지 않음

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int sum = 0;
//		for (int i=1;i<=100;++i) {
//			sum  += i;
//		}
//		sum = 10;  //위에 반복문을 한 이유가 없어짐, 지역변수의 목적으로 사용하면 안됨,목적이 없어짐, 좋은방법이 아님. 
		
		
		//final 키워드를 이용하여 상수화 하여 논리 오류를 컴파일로 찾을 수 있음
		final int sum = sum(100);
//		sum = 10;   컴파일 에러
		System.out.println("sum = " + sum);
		
		
		final String name1 = "홍길동";
		String name2 = "홍길동";
		String name3 = new String("홍길동"); //생성자 생성
		
		if (name1.equals(name2)) {
			System.out.println("같다");
		}
		
		if (name1.equals(name3)) {
			System.out.println("문자열이 같다");
		}
		else {
			System.out.println("문자열이 다르다"); 
		}
		
		if (name1==name3) {
			System.out.println("바라보는 객체가 같다");
		}
		else {
			System.out.println("바라보는 객체가 다르다");
		}
		
		//인덱스의 문자를 리턴해 특정 위치 문자를 추출 0부터 시작
		name1.charAt(0); 
		
		//outofIndex - 특정위치가 길이보다 크면 오류
//		int outofIndex = name1.charAt(4);
//		System.out.println(outofIndex);
		
		
		//문자열 길이
		System.out.println(name2.length()); //3
		
		
		//길동 - 문자열잘라내기
		System.out.println(name3.substring(1));
		
		System.out.println(name3.substring(0,2));
		
		
		//indexOf()로 문자열 찾기
		System.out.println(name3.indexOf("홍"));
		System.out.println(name3.indexOf("박"));
		
		//같은 문자열 다음 문자열 찾기
		
		final String name5 = "자바 프로그래밍, 자바 프로그래밍";
		
		final int idx1 = name5.indexOf("자");
		if (idx1 != -1) {
			final int idx2 = name5.indexOf("자", idx1+1);
			System.out.println("두번째 자가 있는 위치 :" + idx2);
		}
		
//		split메서드를 이용하여 문자열 분리
		String board = "번호,제목,내용,글쓴이";
		String[] arr = board.split(","); 
		
		System.out.println(arr[0]);
		
	}

}
