package FilteringEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class FilteringExample {
	public static void main(String[] args) {

		List<Product> listProduct = new ArrayList<>();

		// ArrayList에 랜덤으로 추가하는 반복문
		for (int i = 1; i <= 5; i++) {
			listProduct.add(new Product(i, "상품" + i, "멋진회사", (int) (10000 * Math.random())));
		}

		// 1을 추가
		listProduct.add(new Product(1, "상품1", "멋진회사", (int) (10000 * Math.random())));

		// 이렇게 하면 hashCode를 추가해서 판별해야함

		listProduct.stream().forEach(p -> System.out.println(p));
		System.out.println();

		listProduct.stream().distinct().forEach(p -> System.out.println(p));
		System.out.println();

		// List 컬렉션 생성
		List<String> list = new ArrayList<>();

		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("신용권");
		list.add("신민철");

		// set로 중복 제거하는 방법
		Set<String> set = new HashSet<String>();
		// set는 중복이 불가능하지만 색인(위치)을 확일 할 수 있도록 ArrayList 추가
		List<Integer> posArray = new ArrayList<Integer>();
		int pos = 0;
		for (String str : list) {
			if (set.add(str)) {
				posArray.add(pos);
			}
			pos++;
		}

		System.out.println(set);
		System.out.println(posArray);

		for (int pos2 : posArray) {
			System.out.println(list.get((pos2)));
		}

		// 중복 요소 제거
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();

		/*
		 * 이렇게 한가지 기능씩을 담당하는 반복문으로 만들어야 효율적이고 빠르다.
		 */
		// startsWith를 이용하여 첫번째요소 찾기
		for (String str : list) {
			if (str.startsWith("신")) {
				System.out.println(str);
			}
		}

		// 신으로 시작하는 문자열을 찾아 새로운 배열에 대입
		List<String> newArray = new ArrayList<String>();
		for (String str : list) {
			if (str.startsWith("신")) {
				newArray.add(str);
			}
		}

		// 배열에 있는 문자열을 출력함
		for (String str : newArray) {
			System.out.println(str);
		}
		System.out.println();

		// Stream과 람다를 이용하게 되면 이렇게 한가지 기능만을 담당하도록 제안해서 쓰는것임
		// 시간은 for문이 빠를 수도 비슷할 수도 있지만 병렬처리를 하게 되면 더 빨라질 수 있어 사용한다.
		// 신으로 시작하는 요소만 필터링
//list.stream()
//  .filter(name -> name.startsWith("신"))
//  .forEach(name -> System.out.println(name));
//System.out.println();

		list.stream().filter(new Predicate<String>() {
			public boolean test(String t) {
				return t.startsWith("신");
			}
		}).forEach(name -> System.out.println(name));
		System.out.println();

//중복 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
		list.stream().distinct().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));
	}
}
