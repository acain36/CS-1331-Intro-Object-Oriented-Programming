import java.util.Scanner;
/**
* This class creates a classified satellite and modifies values.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-18
*/
public class ClassifiedSatellite extends Satellite {

    /**
    * This constructor sets values for a classified satellite.
    * @param name is the name of the satellite
    * @param catalogNumber is the catalog number of the satellite
    * @param launchYear is the year in which it launched
    * @param launchDay is the day in which it launched
    * @param inclination is the inclination launched at
    * @param meanMotion is the number of orbits per day
    */
    public ClassifiedSatellite(String name, int catalogNumber,
        int launchYear, int launchDay, double inclination,
        double meanMotion) {
        super(name, catalogNumber, launchYear, launchDay, inclination,
            meanMotion);
    }


    /**
    * This method checks user input against a password and returns toString if correct.
    * @return a String of satellite info if the passwords match
    */
    @Override
    public String toString() {
        String userPassword;
        String actualPassword = "f8ee89496da476b3849f4de45a4528b4";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Password:");
        userPassword = myScanner.next();
        if (!(userPassword.equals(actualPassword))) {
            return "INCORRECT PASSWORD";
        }
        return super.toString();
    }

    /**
    * This method checks user input against a password and returns encodeCSV if correct.
    * @return a comma-separated format of values from the class is passwords match
    */
    @Override
    public String encodeCSV() {
        String userPassword;
        String actualPassword = "f8ee89496da476b3849f4de45a4528b4";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Password:");
        userPassword = myScanner.next();
        if (!(userPassword.equals(actualPassword))) {
            return "INCORRECT PASSWORD";
        }
        return super.encodeCSV();
    }
}