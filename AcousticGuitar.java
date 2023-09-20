public class AcousticGuitar extends Guitar {
    AcousticGuitar(double price, String brandName, int numOfStrings) {
        super(price, brandName, numOfStrings, Type.ACOUSTIC);
    }

    @Override
    public String toString() {
        return "AcousticGuitar{" +
                "price=" + getPrice() +
                ", brandName='" + getBrandName() + '\'' +
                ", numOfStrings=" + getNumOfStrings() +
                '}';
    }
}
