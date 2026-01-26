package inheritance.code;

public abstract class Employee {
    
    protected String name;
    protected String employeeId;
    protected double baseSalary;
    
    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }
    
    // Common behavior
    public abstract double calculateSalary();
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + employeeId);
    }

}
