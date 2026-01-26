package Abstraction.code;

public class MySQLConnection extends DatabaseConnection {
    @Override
    protected void openConnection() {
        System.out.println("Opening MySQL connection");
    }
    
    @Override
    protected void authenticate() {
        System.out.println("MySQL authentication");
    }
    
    @Override
    protected void executeQuery() {
        System.out.println("Executing MySQL query");
    }
}
