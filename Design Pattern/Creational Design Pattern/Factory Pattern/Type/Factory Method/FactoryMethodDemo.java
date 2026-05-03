// Client Code - Factory Method Pattern Demo
public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println("=== Factory Method Pattern ===\n");
        
        // Create factories
        DatabaseFactory mysqlFactory = new MySQLFactory("localhost", 3306, "myapp");
        DatabaseFactory postgresFactory = new PostgreSQLFactory("localhost", 5432, "myapp");
        DatabaseFactory mongoFactory = new MongoDBFactory("localhost", 27017, "myapp");
        
        // Client code works with factories without knowing concrete classes
        System.out.println("--- MySQL Operations ---");
        mysqlFactory.performDatabaseOperations();
        
        System.out.println("\n--- PostgreSQL Operations ---");
        postgresFactory.performDatabaseOperations();
        
        System.out.println("\n--- MongoDB Operations ---");
        mongoFactory.performDatabaseOperations();
        
        // Can also create connections directly
        System.out.println("\n--- Direct Connection Creation ---");
        DatabaseConnection conn = mysqlFactory.createConnection();
        System.out.println("Created connection type: " + conn.getDatabaseType());
    }
}
