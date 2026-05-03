
public class FactoryMethodDemo1 {
    public static void main(String[] args) {
        // Client works with logistics companies (creators)
        // without knowing specific transport types
        
        System.out.println("=== Logistics Management System ===\n");
        
        // Road delivery
        Logistics roadLogistics = new RoadLogistics("FastTrack Road Logistics");
        roadLogistics.planDelivery("PKG-001", "New York", 500, 50);
        roadLogistics.planDelivery("PKG-002", "Los Angeles", 1000, 75);
        
        // Sea delivery
        Logistics seaLogistics = new SeaLogistics("OceanWide Shipping");
        seaLogistics.planDelivery("PKG-003", "Shanghai Port", 8000, 500);
        
        // Air delivery
        Logistics airLogistics = new AirLogistics("SkyExpress Cargo");
        airLogistics.planDelivery("PKG-004", "London Heathrow", 3000, 25);
        
        // Polymorphism - same interface, different implementations
        System.out.println("\n=== Testing Polymorphism ===");
        Logistics[] allLogistics = {roadLogistics, seaLogistics, airLogistics};
        
        for (Logistics logistics : allLogistics) {
            logistics.displayCompanyInfo();
        }
    }
}

// output

// === Logistics Management System ===


// ========================================
// Company: FastTrack Road Logistics
// Planning delivery for package: PKG-001
// Truck created: TRK-001
// Transport Type: Truck
// Truck ID: TRK-001
// Capacity: 10.0 tons
// Driver: Driver-1
// Truck delivery cost: $350.0

// === Truck Delivery ===
// Package: PKG-001
// Delivering by truck to: New York
// Driver: Driver-1
// Status: Package loaded on truck TRK-001
// Delivery mode: Road transport
// Total Cost: $350.0
// ========================================

// ========================================
// Company: FastTrack Road Logistics
// Planning delivery for package: PKG-002
// Truck created: TRK-002
// Transport Type: Truck
// Truck ID: TRK-002
// Capacity: 10.0 tons
// Driver: Driver-2
// Truck delivery cost: $650.0

// === Truck Delivery ===
// Package: PKG-002
// Delivering by truck to: Los Angeles
// Driver: Driver-2
// Status: Package loaded on truck TRK-002
// Delivery mode: Road transport
// Total Cost: $650.0
// ========================================

// ========================================
// Company: OceanWide Shipping
// Planning delivery for package: PKG-003
// Ship created: SHP-001
// Transport Type: Ship
// Ship ID: SHP-001
// Cargo Capacity: 5000.0 tons
// Port of Registry: International Port
// Ship delivery cost: $2350.0

// === Ship Delivery ===
// Package: PKG-003
// Delivering by ship to port: Shanghai Port
// Ship: SHP-001
// Registry: International Port
// Status: Cargo loaded on ship
// Delivery mode: Sea freight
// Total Cost: $2350.0
// ========================================

// ========================================
// Company: SkyExpress Cargo
// Planning delivery for package: PKG-004
// Airplane created: FL-0001
// Transport Type: Airplane
// Flight Number: FL-0001
// Cargo Weight Limit: 50.0 tons
// Airline: Express Air
// Air delivery cost: $6125.0

// === Air Delivery ===
// Package: PKG-004
// Delivering by air to airport: London Heathrow
// Flight: FL-0001
// Airline: Express Air
// Status: Cargo loaded on aircraft
// Delivery mode: Air freight (Express)
// Total Cost: $6125.0
// ========================================

// === Testing Polymorphism ===
// Logistics Company: FastTrack Road Logistics
// Logistics Company: OceanWide Shipping
// Logistics Company: SkyExpress Cargo