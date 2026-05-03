// Concrete Creator - MySQL Factory
public class MySQLFactory extends DatabaseFactory {
    private String host;
    private int port;
    private String database;
    
    public MySQLFactory(String host, int port, String database) {
        this.host = host;
        this.port = port;
        this.database = database;
    }
    
    @Override
    public DatabaseConnection createConnection() {
        return new MySQLConnection(host, port, database);
    }
}
