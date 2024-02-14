package HashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		//Map 뒤에 <>제네릭 타입은 기본 타입형이 들어갈 수 없음
		//Map 컬렉션 생성
		Map<String,Integer> map = new HashMap< >();

		System.out.println("map이 비어있나요?: " + map.isEmpty());
		
		
		//객체 저장
		map.put("경덕박", 20);
		map.put("경덕", 25);
		map.put("박경덕", 30);
		
		//20 -> 29로 변경
		map.put("경덕박", 29);
		System.out.println("map이 비어있나요?: " + map.isEmpty());
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		//get을 이용하여 키로 값 얻기
		String key = "경덕박";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();
		
		
		Integer value1 = map.get("경덕");
		if (value1 != null) {
			//경덕이라는 key값을 가지고 있다면
			System.out.println(value1);
			System.out.println();
		}
		else {
			System.out.println("Not found 경덕");
		}
		
		
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		//20년전 코드
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Entry<String,Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//10년전 코드
		for (Entry<String, Integer> entry: map.entrySet()) {
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		
		//요즘 사용하는 코드
		for (var entry: map.entrySet()) {
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		
		//키로 엔트리 삭제
		map.remove("경덕");
		System.out.println("총 Entry 수: " + map.size());
		
		
	}

}
