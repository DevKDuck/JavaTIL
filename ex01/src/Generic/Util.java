package Generic;

public class Util {

	//정적 getValue() 메서드 첫번째 매개값으로 Pair 타입과 하위타입만 받고,
	//두번째 매개값으로 키값을 받음
	//리턴값은 키값이 일치할 경우 Pair에 저장된 값을 리턴하고,
	//일치하지 않으면 null을 리턴하도록
	
	
	// <K, V> V 
	public static <K, V> V getValue(Pair<K, V> p, K k) {
		if(p.getKey() == k) {
			return p.getValue();
		} else {
			return null;
		}
	}
}