package ExceptionHandlingEx;

public class ExceptionHandlingExample {
	public static void main(String[] args) {

		String[] array = { "100", "loo" };

		for (int i = 0; i <= array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}



