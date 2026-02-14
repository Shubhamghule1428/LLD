package ISP.goodCode;

public class RobotWorker implements Workable, Attendable {

	@Override
	public void attendingMeeting() {
		System.out.println("Robot is attending a meeting...");

	}

	@Override
	public void work() {
		System.out.println("Robot is working...");
	}

}
