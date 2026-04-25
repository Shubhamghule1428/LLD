public class DatabaseConnection {
    // Instance declared
    private static DatabaseConnection instance = null;
    
    private String connectionString;
    private int maxConnections;
    
    // Private constructor prevents instantiation
    private DatabaseConnection() {
        System.out.println("DatabaseConnection instance created using lazy initialization");
        this.connectionString = "jdbc:mysql://localhost:3306/mydb";
        this.maxConnections = 100;
        initializeConnectionPool();
    }
    
    private void initializeConnectionPool() {
        System.out.println("Initializing connection pool with " + maxConnections + " connections");
    }
    
    // Instance created at time of first Global access method call time
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public void connect() {
        System.out.println("Connecting to database: " + connectionString);
    }
    
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
    
    // Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }
}