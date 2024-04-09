/**
* This class creates a classified satellite and modifies values.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-18
*/
public class GeostationarySatellite extends Satellite {

    /**
    * This constructor sets values for a geostationary satellite.
    * @param name is the name of the satellite
    * @param catalogNumber is the catalog number of the satellite
    * @param launchYear is the year in which it launched
    * @param launchDay is the day in which it launched
    * @param inclination is the inclination launched at
    */
    public GeostationarySatellite(String name, int catalogNumber,
        int launchYear, int launchDay, double inclination) {
        super(name, catalogNumber, launchYear, launchDay, inclination,
            1.0);
    }
}