package RefactoringZoo2;

/*
class Dog  {
	public void 강아지울다() {
		System.out.println("멍멍");
	}
}

class Cat {
	public void 고양이울다() {
		System.out.println("야옹");
	}
}

class 사자 {
	public void 사자가운다() {
		System.out.println("어흥~~~");
	}
}
*/

//의존성 역전 원칙
//다형성,상속성을 사용하여 구현함

class 동물{
	public void 운다() {
		
	}
}

class Dog extends 동물{
	private void 강아지울다() {
		System.out.println("멍멍");
	}
	@Override
	public void 운다() {
		강아지울다();
	}
}

class Cat extends 동물 {
	private void 고양이울다() {
		System.out.println("야옹");
	}
	@Override
	public void 운다() {
		고양이울다();
	}
}

//대표뽑기
//자리바꾸기
//1~18 좌 -> 우


public class 동물원 {
//	private 동물 멍멍이 = new Dog();
//	private 동물 야옹이 = new Cat();
	
	//동물 배열
	private 동물 [] 배열 = new 동물 [100];  
	private int count = 0;
	
//	private 사자 라이언 = new 사자();// 추가됨 -> OCP 위배
	
	//배열이라는 동물 array에 매개변수를 받아 인덱스에 저장 
	public void 동물추가(동물 obj) {
		if(count<100) {
			배열[count++] = obj;
		}
	}
	
	//동물 array를 돌면서 인덱스의 값을 읽어드림
	//Dog와 Cat의 인스턴스가 값에 있고
	//그 값의 운다라는 메서드를 읽어드림
	public void 동물들이모두운다() {
		for (int i=0;i<count;++i) {
			배열[i].운다();
		}
	}

}
