// Product Interface
public interface DatabaseConnection {
    void connect();
    void disconnect();
    void executeQuery(String query);
    String getDatabaseType();
}
