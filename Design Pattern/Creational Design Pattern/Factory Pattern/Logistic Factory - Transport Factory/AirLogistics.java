// Concrete Creator 3 - Air Logistics
public class AirLogistics extends Logistics {
    private int flightCount;
    
    public AirLogistics(String companyName) {
        super(companyName);
        this.flightCount = 0;
    }
    
    @Override
    public Transport createTransport() {
        flightCount++;
        return new Airplane(
            "FL-" + String.format("%04d", flightCount), 
            50.0, 
            "Express Air"
        );
    }
}
