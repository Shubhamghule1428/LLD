package SRP.goodCode;

public class UserActivityLogger {
    public void log(User user, String activity) {
        // Logging only
        System.out.println("User " + user.getName() + " performed: " + activity);
    }
}