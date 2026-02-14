package ISP.badCode;

public class RobotWorker implements Worker {

	@Override
	public void work() {
		System.out.println("Robot is working...");
		
	}

	@Override
	public void sleep() {
		throw new UnsupportedOperationException("Robot can't sleep.");
	}

	@Override
	public void eat() {
		throw new UnsupportedOperationException("Robot can't eat.");
		
	}

	@Override
	public void attendMeeting() {
		System.out.println("Robot is attending a meeting...");
		
	}

}
