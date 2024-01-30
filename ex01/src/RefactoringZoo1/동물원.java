package RefactoringZoo1;

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
	
	class 사자 {
		public void 사자가운다() {
			System.out.println("어흥~~");
		}
	}


public class 동물원{
	private Dog 멍멍이 = new Dog();
	private Cat 야옹이 = new Cat();
	private 사자 라이언 = new 사자(); //추가됨 ->OCP위배
	
	public void 동물들이모두운다() {
		멍멍이.강아지울다();
		야옹이.고양이울다();
		라이언.사자가운다(); //추가됨 -> OCP위배
	}
}
//위 코드의 해결 책:RefactoringZoo2;
