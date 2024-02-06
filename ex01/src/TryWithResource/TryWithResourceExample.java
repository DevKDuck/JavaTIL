package TryWithResource;


public class TryWithResourceExample {

	public static void main(String[] args) {
		// res에 대입 A문자열 인스턴스 생성
		try (Resource res = new Resource("A")) {
			// A 열기
			String data = res.read1();
			// A 읽기
			int value = Integer.parseInt(data);
			// "100" -> 100 파싱
		} catch (Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		} // 예외에 안걸려서 괜츈

		System.out.println();

		// res에 대립 A문자열 인스턴스 생성
		try (Resource res = new Resource("A")) {

			String data = res.read2();
			// A 열기 data -> abc

			// NumberFormatException 발생
			int value = Integer.parseInt(data);

		} catch (Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		Resource res1 = new Resource("A"); 
		Resource res2 = new Resource("B");
		try (res1; res2) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}

	}

}
