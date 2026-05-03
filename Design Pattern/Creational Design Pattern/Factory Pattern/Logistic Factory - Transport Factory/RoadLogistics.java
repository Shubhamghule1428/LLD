// Concrete Creator 1 - Road Logistics
public class RoadLogistics extends Logistics {
    private int truckCount;
    
    public RoadLogistics(String companyName) {
        super(companyName);
        this.truckCount = 0;
    }
    
    @Override
    public Transport createTransport() {
        truckCount++;
        return new Truck(
            "TRK-" + String.format("%03d", truckCount), 
            10.0, 
            "Driver-" + truckCount
        );
    }
}
