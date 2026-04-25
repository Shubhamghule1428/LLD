public class EagerSingletonDemo {
     public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        System.out.println("db1 == db2: " + (db1 == db2)); // true
        
        db1.connect();
        db2.executeQuery("SELECT * FROM users");
    }
}
// output
// PS D:\LLD>  d:; cd 'd:\LLD'; & 'C:\eclipse\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_21.0.9.v20251105-0741\jre\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\shubh\AppData\Roaming\Code\User\workspaceStorage\ebec1710ae1f51fb00fc873358b38a3f\redhat.java\jdt_ws\jdt.ls-java-project\bin' 'EagerSingletonDemo'
// DatabaseConnection instance created
// Initializing connection pool with 100 connections
// db1 == db2: true
// Connecting to database: jdbc:mysql://localhost:3306/mydb
// Executing query: SELECT * FROM users

// It demonstrates that the DatabaseConnection instance is created at the time of class loading, which is the essence of eager initialization. Even if getInstance() is never called, the instance will still be created, which can lead to resource wastage if the instance is never used. However, it is thread-safe as the instance is created before any thread accesses it.
// it's thread-safe because the instance is created at the time of class loading, which is guaranteed to be thread-safe by the Java ClassLoader. However, it may lead to resource wastage if the instance is never used, as it will be created regardless of whether it is needed or not.