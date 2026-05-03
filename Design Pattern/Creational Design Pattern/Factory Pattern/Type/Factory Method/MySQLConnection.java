// Concrete Product - MySQL
public class MySQLConnection implements DatabaseConnection {
    private String host;
    private int port;
    private String database;
    
    public MySQLConnection(String host, int port, String database) {
        this.host = host;
        this.port = port;
        this.database = database;
    }
    
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
        System.out.println("Host: " + host + ":" + port);
        System.out.println("Database: " + database);
        System.out.println("MySQL connected successfully!");
    }
    
    @Override
    public void disconnect() {
        System.out.println("MySQL connection closed");
    }
    
    @Override
    public void executeQuery(String query) {
        System.out.println("MySQL executing: " + query);
    }
    
    @Override
    public String getDatabaseType() {
        return "MySQL";
    }
}
