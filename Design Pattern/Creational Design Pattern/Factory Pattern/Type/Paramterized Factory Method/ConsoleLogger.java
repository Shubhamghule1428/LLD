// Concrete Product - Console Logger
public class ConsoleLogger implements Logger {
    private String level;
    
    public ConsoleLogger(String level) {
        this.level = level;
    }
    
    @Override
    public void log(String message) {
        System.out.println("[CONSOLE-" + level + "] " + message);
    }
    
    @Override
    public String getLogLevel() {
        return level;
    }
}
