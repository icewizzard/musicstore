public abstract class WindInstrument extends Instrument {
    
    private Material material;


    WindInstrument(double price, String brandName, Material material) {
        super(price, brandName);
        this.material = material;
    }

    
    public Material getMaterial() {
        return material;
    }

    //TODO equals
    
}


