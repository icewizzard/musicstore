public class ElectricGuitar extends Guitar {
    ElectricGuitar(double price, String brandName, int numOfStrings) {
        super(price, brandName, numOfStrings, Type.ELECTRIC);
    }

    @Override
    public String toString() {
        return "ElectricGuitar{" +
                "price=" + getPrice() +
                ", brandName='" + getBrandName() + '\'' +
                ", numOfStrings=" + getNumOfStrings() +
                '}';
    }
}