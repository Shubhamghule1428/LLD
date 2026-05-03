// Concrete Product - MongoDB
public class MongoDBConnection implements DatabaseConnection {
    private String host;
    private int port;
    private String database;
    
    public MongoDBConnection(String host, int port, String database) {
        this.host = host;
        this.port = port;
        this.database = database;
    }
    
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB database...");
        System.out.println("Host: " + host + ":" + port);
        System.out.println("Database: " + database);
        System.out.println("MongoDB connected successfully!");
    }
    
    @Override
    public void disconnect() {
        System.out.println("MongoDB connection closed");
    }
    
    @Override
    public void executeQuery(String query) {
        System.out.println("MongoDB executing: " + query);
    }
    
    @Override
    public String getDatabaseType() {
        return "MongoDB";
    }
}
