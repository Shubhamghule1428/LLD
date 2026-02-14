package ISP.badCode;

public class HumanWorker implements Worker {

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
	public void attendMeeting() {
		System.out.println("Human is attending meeting...");
	}

}
