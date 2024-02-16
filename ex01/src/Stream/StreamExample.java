package Stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	private static int sum;
	private static int sum2;

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
		
		
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);

		/* rangeColsed
		 * 
		 * public static IntStream rangeClosed(int startInclusive, int endInclusive) {
		 * if (startInclusive > endInclusive) { return empty(); } else { return
		 * StreamSupport.intStream( new Streams.RangeIntSpliterator(startInclusive,
		 * endInclusive, true), false); } }
		 */

		IntStream stream2 = IntStream.range(1, 100);
		stream2.forEach(a -> sum2 += a);
		System.out.println("총합: " + sum2);

		/*
		 * range 
		 * 
		 * public static IntStream range(int startInclusive, int endExclusive) {
		 * if (startInclusive >= endExclusive) { return empty(); } else { return
		 * StreamSupport.intStream( new Streams.RangeIntSpliterator(startInclusive,
		 * endExclusive, false), false); } }
		 */
	}

}
