package StringBuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		String str ="";
		
		long time1 = System.nanoTime();
		for (int i=0;i<10000;i++) {
			str += "Hello World";
		}
		long time2 = System.nanoTime();
		System.out.println("수행시간 String =" + (time2 - time1));
		
		
		time1 = System.nanoTime();
		StringBuilder str2 = new StringBuilder(); //단일 스레드 동작
		for (int i=0;i<10000;i++) {
			str2.append("Hello World");
		}
		time2 = System.nanoTime();		
		System.out.println("수행시간 StringBuilder=" + (time2 - time1));
		
		
		time1 = System.nanoTime();
		StringBuffer str3 = new StringBuffer();//멀티 스레드 동작 
		for (int i=0;i<10000;i++) {
			str3.append("Hello World");
			}
		time2 = System.nanoTime();		
		System.out.println("수행시간 StringBuffer=" + (time2 - time1));
		
		
		
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
	}
}