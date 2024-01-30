package ex07_static;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
		this.password = "";
		this.age = 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member user1 = new Member("홍길동","hong");
	}

}
