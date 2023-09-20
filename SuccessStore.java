import java.util.ArrayList;

public class SuccessStore {
    private ArrayList<Instrument> instrumentCatalog;


    public SuccessStore(ArrayList<Instrument> instrumentCatalog) {
        this.instrumentCatalog = instrumentCatalog;
    }

    public ArrayList<Instrument> getInstrumentCatalog() {
        return instrumentCatalog;
    }

    public void setInstrumentCatalog(ArrayList<Instrument> instrumentCatalog) {
        this.instrumentCatalog = instrumentCatalog;
    }
    
    public void addAllInstruments(ArrayList<Instrument> anotherArray){

        //add the array to the other array
        this.instrumentCatalog.addAll(anotherArray);

    }

    public void printInstruments(ArrayList<Instrument> instrumentCatalog){
        //print all instruments in the store
    }

    public String getMostExpensiveInstrument(ArrayList<Instrument> anotherArray){
        int max;
        max = anotherArray[0].getPrice;
        return null;
        //run on the array and check the max value of the instrument and return it
    }

    public int getNumOfDifferentElements(ArrayList<Instrument> instrumentCatalog){
        int counter = 0;
            //check how many instruments are diffrent then each other check if they are not equal 

        return counter;
    }
}
