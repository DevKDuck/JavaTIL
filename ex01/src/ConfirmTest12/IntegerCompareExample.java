package ConfirmTest12;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		
		//이유 포장된 객체의 번지를 확인하기 때문임
		
		
		System.out.println(obj1 == obj2); //true
		System.out.println(obj3 == obj4); //false
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2가 같음");
		}
		else {
			System.out.println("obj1과 obj2가 다름");
		}
		
		
		if(obj3.equals(obj4)) {
			System.out.println("obj3과 obj4가 같음");
		}
		else {
			System.out.println("obj3과 obj4가 다름");
		}
	}

}
