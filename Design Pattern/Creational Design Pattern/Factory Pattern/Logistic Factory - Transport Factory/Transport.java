// Product Interface
public interface Transport {
    void deliver(String packageId, String destination);
    double calculateCost(double distance, double weight);
    String getTransportType();
    void displayInfo();
}
