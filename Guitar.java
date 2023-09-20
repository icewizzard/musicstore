public abstract class Guitar extends StringInstrument {
    private Type guitarType;


    Guitar(double price, String brandName, int numOfStrings, Type guitarType) {
        super(price, brandName, numOfStrings);
        this.guitarType = guitarType;
    }

    public Type getGuitarType() {
        return guitarType;
    }

    public static Guitar createGuitar(double price, String brandName, Type type, int numOfStrings) {
        if (numOfStrings > 8 || numOfStrings < 6) {
            throw new IllegalArgumentException("Number of strings cannot be more than 8 or less than 6");
        }
    
        switch (type) {
            case ELECTRIC:
                if (numOfStrings != 6 && numOfStrings != 7 && numOfStrings != 8) {
                    throw new IllegalArgumentException("Electric guitar must have 6, 7, or 8 strings");
                }
                return new ElectricGuitar(price, brandName, numOfStrings);
    
            case ACOUSTIC:
                if (numOfStrings != 6) {
                    throw new IllegalArgumentException("Acoustic guitar must have 6 strings");
                }
                return new AcousticGuitar(price, brandName, numOfStrings);
    
            case CLASSICAL:
                if (numOfStrings != 6) {
                    throw new IllegalArgumentException("Classical guitar must have 6 strings");
                }
                return new ClassicalGuitar(price, brandName, numOfStrings);
    
            default:
                throw new IllegalArgumentException("Invalid guitar type: " + type);
        }
    }
}





