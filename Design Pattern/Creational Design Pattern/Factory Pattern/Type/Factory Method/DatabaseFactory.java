// Creator (Abstract Factory)
public abstract class DatabaseFactory {
    // Factory Method - to be implemented by subclasses
    public abstract DatabaseConnection createConnection();
    
    // Template method using factory method
    public void performDatabaseOperations() {
        DatabaseConnection connection = createConnection();
        
        connection.connect();
        connection.executeQuery("SELECT * FROM users");
        connection.executeQuery("INSERT INTO logs VALUES (...)");
        connection.disconnect();
    }
}
