package LamdaExample1;

//람다식은 한가지 추상메서드만 사용가능해서
//한가지인지만 확인검사하는 어노테이션을 사용함 @FunctionalInterface
@FunctionalInterface
public interface Calculable {
	//추상 메소드
	int calculate(int x, int y);
}