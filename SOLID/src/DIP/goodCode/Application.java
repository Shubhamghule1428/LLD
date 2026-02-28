package DIP.goodCode;

public class Application {

	public static void main(String[] args) {
		// Easy to switch implementations
		NotificationManager emailNotifier = new NotificationManager(new EmailService());
		emailNotifier.notify("Hello", "user@example.com");
		NotificationManager smsNotifier = new NotificationManager(new SMSService());
		smsNotifier.notify("Hello", "+1234567890");
	}
}
