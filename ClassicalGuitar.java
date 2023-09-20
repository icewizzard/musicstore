public class ClassicalGuitar extends Guitar {
    ClassicalGuitar(double price, String brandName, int numOfStrings) {
        super(price, brandName, numOfStrings, Type.CLASSICAL);
    }

    @Override
    public String toString() {
        return "ClassicalGuitar{" +
                "price=" + getPrice() +
                ", brandName='" + getBrandName() + '\'' +
                ", numOfStrings=" + getNumOfStrings() +
                '}';
    }
}