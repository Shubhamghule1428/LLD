// Creator (Abstract)
public abstract class Logistics {
    protected String companyName;
    
    public Logistics(String companyName) {
        this.companyName = companyName;
    }
    
    // Factory Method - to be implemented by subclasses
    public abstract Transport createTransport();
    
    // Template method using factory method
    public void planDelivery(String packageId, String destination, 
                            double distance, double weight) {
        System.out.println("\n========================================");
        System.out.println("Company: " + companyName);
        System.out.println("Planning delivery for package: " + packageId);
        
        // Use factory method to create transport
        Transport transport = createTransport();
        
        transport.displayInfo();
        double cost = transport.calculateCost(distance, weight);
        transport.deliver(packageId, destination);
        
        System.out.println("Total Cost: $" + cost);
        System.out.println("========================================");
    }
    
    public void displayCompanyInfo() {
        System.out.println("Logistics Company: " + companyName);
    }
}
