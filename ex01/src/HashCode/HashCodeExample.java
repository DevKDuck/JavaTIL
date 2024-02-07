package HashCode;

public class HashCodeExample {
	public static void main(String[] args) {
	
		Student s1 = new Student(1, "경덕박");
		Student s2 = new Student(1, "경덕박");
		
		if(s1.hashCode() == s2.hashCode()) {
			if(s1.equals(s2)) {
				System.out.println("동등 객체");
			}
			else {
				System.out.println("데이터가 다르므로 동등 객체가 아님");
			}
		}
		else {
			System.out.println("해시코드가 달라 동등객체가 아님");
		}
	}
}
