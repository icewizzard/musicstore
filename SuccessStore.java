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
    
    public void addAllInstruments(ArrayList<Instrument> newInstruments) {
        // Add all instruments from anotherArray to the instrumentCatalog
        this.instrumentCatalog.addAll(newInstruments);
    }

    

    public void printInstruments(ArrayList<Instrument> instrumentCatalog) {
        // Iterate through the instrumentCatalog and print each instrument
        for (Instrument instrument : instrumentCatalog) {
            System.out.println(instrument.toString());
        }
    }

    public Instrument getMostExpensiveInstrument(ArrayList<Instrument> updatedInstruments) {
    if (updatedInstruments.isEmpty()) {
        return null; // Handle the case where the list is empty
    }

    // Initialize maxPrice to the price of the first instrument in the array
    double maxPrice = updatedInstruments.get(0).getPrice();
    Instrument mostExpensiveInstrument = updatedInstruments.get(0);

    // Iterate through the array to find the most expensive instrument
    for (Instrument instrument : updatedInstruments) {
        double price = instrument.getPrice();
        if (price > maxPrice) {
            maxPrice = price;
            mostExpensiveInstrument = instrument;
        }
    }

    return mostExpensiveInstrument;
}


public int getNumOfDifferentElements(ArrayList<Instrument> instrumentCatalog) {
    int counter = 0;

    // Iterate through the array
    for (int i = 0; i < instrumentCatalog.size(); i++) {
        boolean isDifferent = true;
        Instrument currentInstrument = instrumentCatalog.get(i);

        // Compare the current instrument to all instruments after it in the array
        for (int j = i + 1; j < instrumentCatalog.size(); j++) {
            Instrument otherInstrument = instrumentCatalog.get(j);

            // Check if the current instrument is equal to any other instrument
            if (currentInstrument.equals(otherInstrument)) {
                isDifferent = false;
                break; // If it's not different, exit the inner loop
            }
        }

        // If the current instrument is different from all others, increment the counter
        if (isDifferent) {
            counter++;
        }
    }

    return counter;

}


public static void main(String[] args) {
    
}
}

