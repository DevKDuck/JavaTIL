package Stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
		
		//for 문
		
		for(var e: set) {
			System.out.println(e);
		}
		
		
		//Iterator를 이용한 반복문 처리
//		Iterator<String> iterator = set.iterator();
//		while(iterator.hasNext()) {
//			String item = iterator.next();
//			System.out.println(item);
//		}
//		
//		//Stream을 이용한 반복문 처리
//		Stream<String> stream = set.stream();
//		stream.forEach(name -> System.out.println(name));

		/*
		 * Stream은 
		 * 1.내부 반복적이므로 처리 속도가 빠르고 병렬 처리에 효율적임
		 * 2.람다식으로 다양한 요소 처리를 정의할 수 있다.
		 * 3. 중간 처리와 최종 처리를 수행하도록 파이프 라인을 형성할 수 있다.
		 */
	}

}
