import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        String filename;
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Enter filename");

            filename = userInput.nextLine();
        }

        File myObj = new File(filename);

        if (!myObj.exists()) {
            System.out.println("The file does not exist.");
            return; // Exit the program if the file does not exist.
        }

        try {
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                // Split the text by the "|" character
                String[] parts = data.split("\\|");

                if (parts.length >= 3) {
                    String[] firstPart = parts[0].split(" ");
                    String[] secondPart = parts[1].split(",");
                    String[] thirdPart = parts[2].split(":");

                    if (firstPart.length == 2 && secondPart.length == 2 && thirdPart.length == 2co) {
                        String brandName = firstPart[1].trim();
                        String objectType = secondPart[1].trim();
                        String objectDetails = thirdPart[1].trim();

                        System.out.println("Brand Name: " + brandName);
                        System.out.println("Object Type: " + objectType);
                        System.out.println("Object Details: " + objectDetails);
                    } else {
                        System.out.println("Invalid line format: " + data);
                    }
                } else {
                    System.out.println("Invalid line format: " + data);
                }
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
