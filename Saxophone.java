public class Saxophone extends WindInstrument {
    private Material material;



    Saxophone(double price, String brandName, Material material) {
        super(price, brandName);

        // Check if the material is "metal"
        if (material != Material.METAL) {
            throw new IllegalArgumentException("Saxophone can only be made from metal.");
        }

        this.material = material;
    }
    
    public Material getMaterial() {
        return material;
    }
    
    @Override
    public String toString() {
        return "Saxophone{" +
                "price=" + getPrice() +
                ", brandName='" + getBrandName() + '\'' +
                ", material=" + material +
                '}';
    }

    
}