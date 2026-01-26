package inheritance.code;

public class PartTImeEmployee extends Employee {
    
    private int hoursWorked;
    private double hourlyRate;

     public PartTImeEmployee(String name, String employeeId, int hoursWorked, double hourlyRate) {
        super(name, employeeId, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
