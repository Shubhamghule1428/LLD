public class LazyInitializationDemo {
     public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        System.out.println("db1 == db2: " + (db1 == db2)); // true
        
        db1.connect();
        db2.executeQuery("SELECT * FROM users");
    }
}

// output
// DatabaseConnection instance created using lazy initialization
// Initializing connection pool with 100 connections
// db1 == db2: true
// Connecting to database: jdbc:mysql://localhost:3306/mydb
// Executing query: SELECT * FROM users

// It demonstrates that the DatabaseConnection instance is created only when getInstance() is called for the first time, which is the essence of lazy initialization.
// it's thread-unsafe, if two threads call getInstance() at the same time when instance is null, they may both create separate instances, violating the singleton property. To make it thread-safe, you can synchronize the getInstance() method or use other techniques like double-checked locking.