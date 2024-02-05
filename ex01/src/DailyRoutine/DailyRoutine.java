package DailyRoutine;

public class DailyRoutine {
	public static void main(String[] args) {
		
		new WakeUp("06시");
		
		GettingReadyAtHome ready = new GettingReadyAtHome();
		ready.takeAShower();
		ready.changDresse();
		
		Eat eat = new Eat();
		eat.eatBreakfast("06시40분");
		
		PublicTransportation goEducationInstitute = new PublicTransportation();
		
		goEducationInstitute.takeTheBus("7시15분");
		goEducationInstitute.takeTheSubway("7시39분");
		
		
		TaekAClass c = new TaekAClass();
		c.takeMorningLesson("09시", "13시");
		
		eat.eatLunch("13시");
		
		c.takeAfternoonLesson("14시", "18시");

		goEducationInstitute.takeTheSubway("18시 10분 ");
		
		
		Exercise ex = new Exercise();
		ex.aerobicExercise("18시 40분");
		ex.weightTraining("19시");
		
		ready.takeAShower();
		ready.changDresse();

		eat.eatDinner("20시 30분");

		goEducationInstitute.takeTheBus("21시");
		new Sleep("23시");
	}
}
