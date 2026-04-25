public class Logger {
    // Volatile ensures visibility of changes across threads
    private static volatile Logger instance;
    
    private StringBuilder logs;
    private String logLevel;
    
    private Logger() {
        System.out.println("Logger instance created");
        this.logs = new StringBuilder();
        this.logLevel = "INFO";
    }
    
    // Double-checked locking
    public static Logger getInstance() {
        // First check (no locking)
        if (instance == null) {
            // Synchronize only if instance is null
            synchronized (Logger.class) {
                // Second check (with locking)
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    public void log(String message) {
        String logEntry = String.format("[%s] %s: %s\n", 
            new java.util.Date(), logLevel, message);
        logs.append(logEntry);
        System.out.print(logEntry);
    }
    
    public void setLogLevel(String level) {
        this.logLevel = level;
        log("Log level changed to " + level);
    }
    
    public void debug(String message) {
        String originalLevel = logLevel;
        logLevel = "DEBUG";
        log(message);
        logLevel = originalLevel;
    }
    
    public void error(String message) {
        String originalLevel = logLevel;
        logLevel = "ERROR";
        log(message);
        logLevel = originalLevel;
    }
    
    public String getAllLogs() {
        return logs.toString();
    }
    
    public void clearLogs() {
        logs = new StringBuilder();
        log("Logs cleared");
    }
}
