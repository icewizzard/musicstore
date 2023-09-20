public class SideFlute extends FluteClass {

    SideFlute(double price, String brandName, Material material) {
        super(price, brandName, material, FluteType.SIDEFLUTE);
    }

    @Override
    public String toString() {
        return "SideFlute{" +
                "price=" + getPrice() +
                ", brandName='" + getBrandName() + '\'' +
                ", material=" + getMaterial() +
                ", type=" + getType() +
                '}';
    }
}
