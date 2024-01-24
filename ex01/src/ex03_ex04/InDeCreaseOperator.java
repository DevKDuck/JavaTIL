package ex03_ex04;

public class InDeCreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		전위형
		연산자가 앞에 있음 
		 
		 후위형
		 연산자가 뒤에 있음
		 값을 사용하고 다음에 증가
		 
		  *참고
		  *어셈블리어에서 실제로 inc 명령어를 가지고 있음
		  *특정 레지스터나 메모리 위치 값을 1씩 증가시킴
		  *dec는 1감소
		  *그래서 전위형이 빠름
		 
		 */
		
		//전위형
		int x = 10;
		x++; //;지나고 1증가
		System.out.println("x = " + x); 
		
		
		//전위형
		x = 10;
		++x; //먼저 증가
		System.out.println("x = " + x); 
		
		int y;
		int z;
		
		x = 10;
		y = 10;
		z = ++x + y++;
		//x = 11 , y = 10 , z= 21
		//y = 11
		
		System.out.println("x =" + x + " y = " + y + " z =" + z);
	}

}
