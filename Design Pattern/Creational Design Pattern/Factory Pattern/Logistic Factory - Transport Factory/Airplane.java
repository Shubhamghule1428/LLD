// Concrete Product 3 - Airplane
public class Airplane implements Transport {
    private String flightNumber;
    private double cargoWeight;
    private String airline;
    
    public Airplane(String flightNumber, double cargoWeight, String airline) {
        this.flightNumber = flightNumber;
        this.cargoWeight = cargoWeight;
        this.airline = airline;
        System.out.println("Airplane created: " + flightNumber);
    }
    
    @Override
    public void deliver(String packageId, String destination) {
        System.out.println("\n=== Air Delivery ===");
        System.out.println("Package: " + packageId);
        System.out.println("Delivering by air to airport: " + destination);
        System.out.println("Flight: " + flightNumber);
        System.out.println("Airline: " + airline);
        System.out.println("Status: Cargo loaded on aircraft");
        System.out.println("Delivery mode: Air freight (Express)");
    }
    
    @Override
    public double calculateCost(double distance, double weight) {
        // $2 per km + $5 per kg (expensive but fast)
        double cost = (distance * 2) + (weight * 5);
        System.out.println("Air delivery cost: $" + cost);
        return cost;
    }
    
    @Override
    public String getTransportType() {
        return "AIRPLANE";
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Transport Type: Airplane");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Cargo Weight Limit: " + cargoWeight + " tons");
        System.out.println("Airline: " + airline);
    }
    
    public void checkFlightClearance() {
        System.out.println("Checking flight clearance for " + flightNumber);
    }
}
