public class DatabaseConnection {
    // Instance created at class loading time
    private static final DatabaseConnection instance = new DatabaseConnection();
    
    private String connectionString;
    private int maxConnections;
    
    // Private constructor prevents instantiation
    private DatabaseConnection() {
        System.out.println("DatabaseConnection instance created");
        this.connectionString = "jdbc:mysql://localhost:3306/mydb";
        this.maxConnections = 100;
        initializeConnectionPool();
    }
    
    private void initializeConnectionPool() {
        System.out.println("Initializing connection pool with " + maxConnections + " connections");
    }
    
    // Global access point
    public static DatabaseConnection getInstance() {
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