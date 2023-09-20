public class BassFlute extends FluteClass{

    BassFlute(double price, String brandName, Material material) {
        super(price, brandName, material, FluteType.BASSFLUTE);
        
    }
    @Override
    public String toString() {
        return "BassFlute{" +
                "price=" + getPrice() +
                ", brandName='" + getBrandName() + '\'' +
                ", material=" + getMaterial() +
                ", type=" + getType() +
                '}';
    }
}
