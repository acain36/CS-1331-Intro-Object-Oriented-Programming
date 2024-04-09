import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
/**
* This class passes file data through the SatelliteTLEParser to a new file.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-18
*/
public class SatelliteDataConverter {

    /**
    * This method returns an array of satelliite objects from a file of data.
    * @param satellite_data is a file consisting of satellite information
    * @return an array of satellite objects
    */
    private static Satellite[] createSatelliteArray(File satelliteData) {
        String fullString = "";
        try {
            File[] newList = satelliteData.listFiles();
            Satellite[] theSatellites = new Satellite[newList.length];
            for (int i = 0; i < newList.length; i++) {
                Scanner myScan = new Scanner(newList[i]);
                while (myScan.hasNext()) {
                    fullString += myScan.nextLine();
                    fullString += "\n";
                }
                theSatellites[i] = SatelliteTLEParser.parseData(fullString);
                fullString = "";
            }
            return theSatellites;
        } catch (FileNotFoundException fnf) {
            System.out.println("FNFE caught!");
            System.out.println("Error: " + fnf.getMessage());
        } finally {
            System.out.println("finally done");
        }
        return null;
    }

    /**
    * This main method transfers one file of data to another.
    * @param args is the argument array for the main method
    */
    public static void main(String[] args) {
        File myFile = new File(args[0]);
        Satellite[] myArray = createSatelliteArray(myFile);

        File newFile = new File("satellite_output.csv");

        try {
            FileWriter writer = new FileWriter(newFile);
            for (int i = 0; i < myArray.length; i++) {
                Satellite currentSatellite = myArray[i];
                writer.write(currentSatellite.encodeCSV());
                writer.flush();
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("FNFE caught!");
            System.out.println("Error: " + fnf.getMessage());
        } catch (IOException e) {
            System.err.println("Error with file passed in to FileWriter");
        } finally {
            System.out.println("finally done");
        }
    }


}