package Reflection;

import java.lang.reflect.*;

public class ReflectionExample {
	public static void main(String[] args) throws Exception {

		if (args.length != 4) {
			System.out.println("사용법 : java  ReflectionExample 클래스 필드명 값 메소드명");
			System.exit(0);
		}

		Class clazz = Class.forName(args[0]);
//    Car car = new Car();
		// 기본생성자 함수 정보
		Constructor constructor = clazz.getDeclaredConstructor();
		// new Car(); 와 같은 동작을 함수로 실행
		Object obj = constructor.newInstance();
		System.out.println(obj);

		Field field = clazz.getDeclaredField(args[1]);
		if (field != null) {
			// car.setModel("현대");
			// car.model = "현대";
			field.setAccessible(true);
			field.set(obj, args[2]);
		}
		System.out.println(obj);

		// 메서드 리플렉션
		try {
			Method method = clazz.getDeclaredMethod(args[3]);
			if (method != null) {
				method.setAccessible(true);
				method.invoke(obj);
			}
		} catch (NoSuchMethodException e) {
			System.out.println(args[3] + "메서드가 존재하지 않습니다.");
		}

//      Person person = new Person();

//      
//      Class clazz = Car.class;
//      //Car car = new Car();
//      
//      System.out.println("[생성자 정보]");
//      Constructor[] constructors = clazz.getDeclaredConstructors();
//      for (Constructor constructor : constructors) {
//         System.out.print(constructor.getName() + "(");
//         Class[] parameters = constructor.getParameterTypes();
//         printParameters(parameters);
//         System.out.println(")");
//      }
//      System.out.println();
//
//      System.out.println("[필드 정보]");
//      Field[] fields = clazz.getDeclaredFields();
//      for (Field field : fields) {
//         System.out.println(field.getType().getName() + " " + field.getName());
//      }
//      System.out.println();
//
//      System.out.println("[메소드 정보]");
//      Method[] methods = clazz.getDeclaredMethods();
//      for (Method method : methods) {
//         System.out.print(method.getName() + "(");
//         Class[] parameters = method.getParameterTypes();
//         printParameters(parameters);
//         System.out.println(")");
//      }
	}

//
	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length - 1)) {
				System.out.print(",");
			}
		}
	}
}