public class CBDCPayment implements Payment {
    private String walletAddress;
    
    public CBDCPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing CBDC payment: Rs." + amount);
        System.out.println("Wallet: " + walletAddress);
    }
    
    @Override
    public boolean validatePaymentDetails() {
        return walletAddress.length() > 26;
    }
}
