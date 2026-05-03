// Concrete Product - File Logger
public class FileLogger implements Logger {
    private String level;
    private String filename;
    
    public FileLogger(String level, String filename) {
        this.level = level;
        this.filename = filename;
    }
    
    @Override
    public void log(String message) {
        System.out.println("[FILE-" + level + "] Writing to " + filename + ": " + message);
    }
    
    @Override
    public String getLogLevel() {
        return level;
    }
}
