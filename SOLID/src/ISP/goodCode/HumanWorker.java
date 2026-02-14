package ISP.goodCode;

public class HumanWorker implements Workable, Eatable, Sleepable, Attendable {

	@Override
	public void work() {
		System.out.println("Human is working...");
	}

	@Override
	public void sleep() {
		System.out.println("Human is sleeping...");
	}

	@Override
	public void eat() {
		System.out.println("Human is eating...");
	}

	@Override
	public void attendingMeeting() {
		System.out.println("Human is attending meeting...");
	}

}
