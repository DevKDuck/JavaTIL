package RefactoringZoo;

class Dog {
	public void 강아지울다() {
		System.out.println("멍멍");
	}
}

class Cat {
	public void 고양이울다() {
		System.out.println("야옹");
	}
}

public class 동물원 {
	private Dog 멍멍이 = new Dog();
	private Cat 야옹이 = new Cat();

	public void 동물들이모두운다() {
		멍멍이.강아지울다();
		야옹이.고양이울다();
	}
}


//기능 추가: 동물원에 사자 추가시 결과 코드Zoo1