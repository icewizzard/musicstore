public abstract class FluteClass extends WindInstrument {
    private Material material;
    private FluteType type;

    FluteClass(double price, String brandName, Material material, FluteType type) {
        super(price, brandName);
        this.material = material;
        this.type = type;
    }

    public Material getMaterial() {
        return material;
    }

    public FluteType getType() {
        return type;
    }
    public static FluteClass createFlute(double price, String brandName, Material material, FluteType type) {
    switch (type) {
        case PICCOLO:
            return new Piccolo(price, brandName, material);
        case BASSFLUTE:
            return new BassFlute(price, brandName, material);
        case SIDEFLUTE:
            return new SideFlute(price, brandName, material);
        default:
            throw new IllegalArgumentException("Invalid FluteType: " + type);
    }
}

}



