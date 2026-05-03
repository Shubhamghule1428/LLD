// Concrete Creator - MongoDB Factory
public class MongoDBFactory extends DatabaseFactory {
    private String host;
    private int port;
    private String database;
    
    public MongoDBFactory(String host, int port, String database) {
        this.host = host;
        this.port = port;
        this.database = database;
    }
    
    @Override
    public DatabaseConnection createConnection() {
        return new MongoDBConnection(host, port, database);
    }
}
