public abstract class Instrument {
    private double price;
    private String brandName;
    
    
    Instrument(double price, String brandName) {
        this.price = price;
        this.brandName = brandName;
    }

    

    public double getPrice() {
        return price;
    }
    
    public String getBrandName() {
        return brandName;
    }
}
