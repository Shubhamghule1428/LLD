package inheritance.code;

public class FullTimeEmployee extends Employee {
    private double benefits;
    
    public FullTimeEmployee(String name, String employeeId, double baseSalary, double benefits) {
        super(name, employeeId, baseSalary);
        this.benefits = benefits;
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + benefits;
    }
}