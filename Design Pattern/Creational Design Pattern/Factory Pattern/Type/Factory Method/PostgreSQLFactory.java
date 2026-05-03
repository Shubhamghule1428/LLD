// Concrete Creator - PostgreSQL Factory
public class PostgreSQLFactory extends DatabaseFactory {
    private String host;
    private int port;
    private String database;
    
    public PostgreSQLFactory(String host, int port, String database) {
        this.host = host;
        this.port = port;
        this.database = database;
    }
    
    @Override
    public DatabaseConnection createConnection() {
        return new PostgreSQLConnection(host, port, database);
    }
}
