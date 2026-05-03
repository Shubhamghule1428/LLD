// Product Interface
import java.util.Map;

public interface Notification {
    void send(String recipient, String message);
    boolean validate(String recipient);
    String getNotificationType();
    void configure(Map<String, String> config);
}
