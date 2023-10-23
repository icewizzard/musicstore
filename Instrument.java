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

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Instrument){
            Instrument instrument = (Instrument) obj;
            return instrument.getPrice()==obj.get
        }
    }
}
