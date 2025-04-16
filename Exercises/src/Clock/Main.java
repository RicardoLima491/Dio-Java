package Clock;

public class Main {

	public static void main(String[] args) {
		Clock brlClock = new BRLClock();
		brlClock.setMinute(3);
		brlClock.setSecond(1);
		brlClock.setHour(19);
		System.out.println(brlClock.getTime());
		System.out.println(new USClock().convert(brlClock).getTime());

	}

}
