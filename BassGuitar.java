public class BassGuitar extends StringInstrument {
    private boolean fretless;

    public BassGuitar(double price, String brandName, int numOfStrings, boolean fretless) {
        super(price, brandName, numOfStrings);

        if (numOfStrings < 4 || numOfStrings > 6) {
            throw new IllegalArgumentException("Invalid number of strings for BassGuitar. It should be between 4 and 6.");
        }

        this.fretless = fretless;
    }

    public boolean isFretless() {
        return fretless;
    }

    @Override
    public String toString() {
        return "BassGuitar{" +
                "price=" + getPrice() +
                ", brandName='" + getBrandName() + '\'' +
                ", numOfStrings=" + getNumOfStrings() +
                ", fretless=" + fretless +
                '}';
    }
}
