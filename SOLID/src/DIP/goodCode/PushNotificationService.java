package DIP.goodCode;

public class PushNotificationService implements MessageService {

	@Override
	public void sendMessage(String message, String receiver) {
		System.out.println("Push notification to " + receiver + ": " + message);
	}
}
