/**
* This class creates a satellite parent class and modifies values.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-18
*/
public class Satellite {
    private String name;
    private int catalogNumber;
    private int launchYear;
    private int launchDay;
    private double inclination;
    private double meanMotion;

    /**
    * This constructor sets values for a satellite.
    * @param name is the name of the satellite
    * @param catalogNumber is the catalog number of the satellite
    * @param launchYear is the year in which it launched
    * @param launchDay is the day in which it launched
    * @param inclination is the inclination launched at
    * @param meanMotion is the number of orbits per day
    */
    public Satellite(String name, int catalogNumber,
        int launchYear, int launchDay, double inclination,
        double meanMotion) {
        this.name = name;
        this.catalogNumber = catalogNumber;
        this.launchYear = launchYear;
        this.launchDay = launchDay;
        this.inclination = inclination;
        this.meanMotion = meanMotion;
    }

    /**
    * This method calculated the number of minutes to complete one orbit.
    * @return a double representing the number of minutes
    */
    public double orbitTime() {
        double time;
        time = (24 * 60) / this.meanMotion;
        return time;
    }

    /**
    * This method returns a string representing values from the class.
    * @return a string holding these values
    */
    public String toString() {
        return this.name + ": #" + this.catalogNumber
            + ". Launched on day " + this.launchDay
            + " of " + this.launchYear
            + ". Inclination: " + this.inclination
            + " degrees. " + this.meanMotion
            + " orbits per day - " + orbitTime()
            + " minutes per orbit.\n";
    }

    /**
    * This method will return a string in comma-separated format.
    * @return a comma-separated format of values from the class
    */
    public String encodeCSV() {
        return this.name + ", " + this.catalogNumber + ", "
            + this.launchYear + ", " + this.launchDay + ", "
            + this.inclination + ", " + this.meanMotion + ", "
            + orbitTime() + "\n";

    }


}