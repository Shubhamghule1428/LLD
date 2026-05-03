// Concrete Product - PostgreSQL
public class PostgreSQLConnection implements DatabaseConnection {
    private String host;
    private int port;
    private String database;
    
    public PostgreSQLConnection(String host, int port, String database) {
        this.host = host;
        this.port = port;
        this.database = database;
    }
    
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
        System.out.println("Host: " + host + ":" + port);
        System.out.println("Database: " + database);
        System.out.println("PostgreSQL connected successfully!");
    }
    
    @Override
    public void disconnect() {
        System.out.println("PostgreSQL connection closed");
    }
    
    @Override
    public void executeQuery(String query) {
        System.out.println("PostgreSQL executing: " + query);
    }
    
    @Override
    public String getDatabaseType() {
        return "PostgreSQL";
    }
}
