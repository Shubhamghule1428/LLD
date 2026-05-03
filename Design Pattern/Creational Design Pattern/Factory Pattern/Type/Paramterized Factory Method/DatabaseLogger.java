// Concrete Product - Database Logger
public class DatabaseLogger implements Logger {
    private String level;
    private String tableName;
    
    public DatabaseLogger(String level, String tableName) {
        this.level = level;
        this.tableName = tableName;
    }
    
    @Override
    public void log(String message) {
        System.out.println("[DB-" + level + "] Inserting to " + tableName + ": " + message);
    }
    
    @Override
    public String getLogLevel() {
        return level;
    }
}
