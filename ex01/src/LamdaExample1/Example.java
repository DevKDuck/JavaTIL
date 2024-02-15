package LamdaExample1;

public class Example {
	private static Student[] students = { new Student("홍길동", 90, 96), new Student("신용권", 95, 93) };

	
	private static double avg(Function<Student> function) {
		int sum = 0;
		
		for (Student student: students) {
			sum += function.apply(student);
		}
		return (double)sum / students.length;
	};
	
	
	
	public static void main(String[] args) {		
		
		//메소드 참조
		double eAvg = avg(Student::getEnglishScore);
		double mAvg = avg(Student::getMathScore);
		
		//람다식 사용
		double englishAvg = avg( s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}

}
