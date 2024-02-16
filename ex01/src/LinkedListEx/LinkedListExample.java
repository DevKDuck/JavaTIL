package LinkedListEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		
		//ArrayList생성
		List<String> list1 = new ArrayList<>();
		
		//LinkedList생성
		List<String> list2 = new LinkedList<>();
		
		
		long startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			//0번째 인덱스에 저장
			list1.add(0, String.valueOf(i));
		}
		long endTime = System.nanoTime();
		System.out.println(endTime-startTime);
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			//0번째 인덱스에 저장
			list2.add(0, String.valueOf(i));
		}

		endTime = System.nanoTime();
		System.out.println(endTime-startTime);
		
	}

}
