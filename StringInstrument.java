public abstract class StringInstrument extends Instrument{
    private int numOfStrings;


    StringInstrument(double price, String brandName, int numOfStrings) {
        super(price, brandName);

        if (numOfStrings < 4 || numOfStrings > 8) {
            throw new IllegalArgumentException("WindInstrument can't have less than 4 or more than 8 strings.");
        }

        this.numOfStrings = numOfStrings;
    }    
    
    public int getNumOfStrings() {
        return numOfStrings;
    }    

}
