// Concrete Creator 2 - Sea Logistics
public class SeaLogistics extends Logistics {
    private int shipCount;
    
    public SeaLogistics(String companyName) {
        super(companyName);
        this.shipCount = 0;
    }
    
    @Override
    public Transport createTransport() {
        shipCount++;
        return new Ship(
            "SHP-" + String.format("%03d", shipCount), 
            5000.0, 
            "International Port"
        );
    }
}
