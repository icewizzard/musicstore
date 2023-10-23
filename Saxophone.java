public class Saxophone extends WindInstrument {

    public Saxophone(double price, String brandName, Material material) {
        super(price, brandName, material);
        if(material != Material.METAL){
            throw new IllegalArgumentException("Saxophone.");

        }
    }



    

    
}