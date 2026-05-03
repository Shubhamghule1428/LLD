// Concrete Product 2 - Ship
public class Ship implements Transport {
    private String shipId;
    private double cargoCapacity;
    private String portOfRegistry;
    
    public Ship(String shipId, double cargoCapacity, String portOfRegistry) {
        this.shipId = shipId;
        this.cargoCapacity = cargoCapacity;
        this.portOfRegistry = portOfRegistry;
        System.out.println("Ship created: " + shipId);
    }
    
    @Override
    public void deliver(String packageId, String destination) {
        System.out.println("\n=== Ship Delivery ===");
        System.out.println("Package: " + packageId);
        System.out.println("Delivering by ship to port: " + destination);
        System.out.println("Ship: " + shipId);
        System.out.println("Registry: " + portOfRegistry);
        System.out.println("Status: Cargo loaded on ship");
        System.out.println("Delivery mode: Sea freight");
    }
    
    @Override
    public double calculateCost(double distance, double weight) {
        // $0.2 per km + $1.5 per kg (cheaper but slower)
        double cost = (distance * 0.2) + (weight * 1.5);
        System.out.println("Ship delivery cost: $" + cost);
        return cost;
    }
    
    @Override
    public String getTransportType() {
        return "SHIP";
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Transport Type: Ship");
        System.out.println("Ship ID: " + shipId);
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
        System.out.println("Port of Registry: " + portOfRegistry);
    }
    
    public void checkWeatherConditions() {
        System.out.println("Checking weather conditions for ship " + shipId);
    }
}
