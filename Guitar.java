public class Guitar extends StringInstrument {

    private Type guitarType;

    public Guitar(double price, String brandName, int numOfStrings, Type guitarType) {
        super(price, brandName, numOfStrings);
        this.guitarType = guitarType;
    }

    public Type getGuitarType() {
        return guitarType;
    }
    
    

}





