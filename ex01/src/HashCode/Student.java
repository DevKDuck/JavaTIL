package HashCode;

public class Student {
	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	
	//Object의 hashCode 메서드를 재정의
	@Override
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}

	//Student객체인지 확인 후 학생번호와 이름이 같으면 true 리턴하도록함
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			if (no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}

}
