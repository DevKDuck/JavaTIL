package Generic;

public class Container2 <K,V> {
	private K k;
	private V v;
	
	public void set(K k, V v) {
		this.k = k;
		this.v = v;
	}
	
	public K getKey() {
		return this.k;
	}
	
	public V getValue() {
		return this.v;
	}

}
