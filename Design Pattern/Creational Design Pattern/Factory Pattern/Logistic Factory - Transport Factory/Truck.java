// Concrete Product 1 - Truck
public class Truck implements Transport {
    private String truckId;
    private double capacity;
    private String driverName;
    
    public Truck(String truckId, double capacity, String driverName) {
        this.truckId = truckId;
        this.capacity = capacity;
        this.driverName = driverName;
        System.out.println("Truck created: " + truckId);
    }
    
    @Override
    public void deliver(String packageId, String destination) {
        System.out.println("\n=== Truck Delivery ===");
        System.out.println("Package: " + packageId);
        System.out.println("Delivering by truck to: " + destination);
        System.out.println("Driver: " + driverName);
        System.out.println("Status: Package loaded on truck " + truckId);
        System.out.println("Delivery mode: Road transport");
    }
    
    @Override
    public double calculateCost(double distance, double weight) {
        // $0.5 per km + $2 per kg
        double cost = (distance * 0.5) + (weight * 2);
        System.out.println("Truck delivery cost: $" + cost);
        return cost;
    }
    
    @Override
    public String getTransportType() {
        return "TRUCK";
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Transport Type: Truck");
        System.out.println("Truck ID: " + truckId);
        System.out.println("Capacity: " + capacity + " tons");
        System.out.println("Driver: " + driverName);
    }
    
    public void checkTireCondition() {
        System.out.println("Checking tire condition for truck " + truckId);
    }
}
