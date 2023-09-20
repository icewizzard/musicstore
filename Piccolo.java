public class Piccolo extends FluteClass {
    
    Piccolo(double price, String brandName, Material material) {
        super(price, brandName, material, FluteType.PICCOLO );
        
    }
    @Override
    public String toString() {
        return "Piccolo{" +
                "price=" + getPrice() +
                ", brandName='" + getBrandName() + '\'' +
                ", material=" + getMaterial() +
                ", type=" + getType() +
                '}';
    }
}
