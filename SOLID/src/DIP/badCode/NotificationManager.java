package DIP.badCode;

public class NotificationManager {
	// Tight coupling
	private EmailService emailService;

	public NotificationManager() {
		// Direct instantiation
		this.emailService = new EmailService();
	}

	public void notify(String message) {
		emailService.sendEmail(message);
		// Hard to switch to SMS or Push notification
	}
}