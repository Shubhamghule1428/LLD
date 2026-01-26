package Abstraction.code;

public abstract class DatabaseConnection {
    
    protected String connectionString;

    // Template Method Pattern - defines the algorithm of flow of method
    public final void connect(){
        System.out.println("Started connection...");
        openConnection();
        authenticate();
        executeQuery();
        closeConnection();
    }

    // Abstract MEthods - to implement by subclass
    protected abstract void openConnection();
    protected abstract void authenticate();
    protected abstract void executeQuery();

    protected void closeConnection() {
        System.out.println("Clossing Connection.....");
    }
}
