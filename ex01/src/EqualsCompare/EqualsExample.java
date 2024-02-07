package EqualsCompare;

public class EqualsExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		// obj1과 2 동등비교
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등하다");
		} else {
			System.out.println("obj1과 obj2는동등하지 않다.");
		}

		// obj1과 2 동등비교
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등하다");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않다.");
		}

	}

}
