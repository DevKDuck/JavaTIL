package TryWithResource;

public class Resource implements AutoCloseable{
	private String name;
	
	public Resource(String name) {
		this.name = name;
		System.out.println(name + "열기");
	}
	
	public String read1() {
		System.out.println(name + "읽기");
		return "100";
	}
	
	public String read2() {
		System.out.println(name + "읽기");
		return "abc";
	}

	@Override
	public void close() throws Exception {
		//AutoCloseable 인터페이스를 참조시 자동 닫기 메서드 오버라이드
		System.out.println(name + "닫기");
	}

}
