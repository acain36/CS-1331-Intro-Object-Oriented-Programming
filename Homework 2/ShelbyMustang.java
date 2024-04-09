/**
* This class extends Car and creates Shelby Mustang to be sold.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-11
*/
public class ShelbyMustang extends Car {
    private int racesWon;

    /**
    * Sets values for a car object.
    * @param name is the name of the the car
    * @param make the model of the car
    * @param fuelLevel is the fuel level of the car
    * @param horsepower represents how much horsepower the car has
    * @param previousUpgrade stores whether the car has been brought
    * in before
    * @param racesWon is the amount of races a particular car wins
    */
    public ShelbyMustang(String name, String make,
        double fuelLevel, int horsepower,
        boolean previousUpgrade, int racesWon) {
        super(name, make, fuelLevel, horsepower, previousUpgrade);
        this.racesWon = racesWon;
    }

    /**
    * Constructor with no arguments.
    */
    public ShelbyMustang() {
        this("Carroll", "Shelby Automotives", 100, 350, false, 0);
    }

    /**
    * Returns values for the Mustang, using the toString() from Car.
    * @return String of values in the program
    */
    @Override
    public String toString() {
        return super.toString() + ", Races Won:" + this.racesWon;
    }

    /**
    * This method tests if two cars are equal in aspects.
    * @param m is the Object that is being passed through
    * @return a booleans depending on whether the cars are equal
    */
    public boolean equals(Object m) {
        if (m == null) {
            return false;
        } else if (m instanceof ShelbyMustang) {
            return ((super.equals(m))
                && (this.racesWon == (((ShelbyMustang) m).racesWon)));
        } else {
            return false;
        }
    }

    /**
    * Writes abstract class of races() from Car.
    * Overrides this class to take in a parameter.
    * @param theirCar is the car that will be racing
    */
    @Override
    public void race(Car theirCar) {
        if ((theirCar.getClass() == this.getClass())
            && (this.getFuelLevel() > 50)
            && (theirCar.getFuelLevel() > 50)) {
            this.setFuelLevel(this.getFuelLevel() - 25.0);
            theirCar.setFuelLevel(theirCar.getFuelLevel() - 25.0);

            if (this.getHorsePower() > theirCar.getHorsePower()) {
                this.racesWon += 1;
                System.out.println(this.getName()
                    + " won against " + theirCar.getName());
            } else if (theirCar.getHorsePower()
                > this.getHorsePower()) {
                ((ShelbyMustang) theirCar).racesWon += 1;
                System.out.println(((ShelbyMustang) theirCar).getName()
                    + " won against " + this.getName());
            } else if ((((ShelbyMustang) theirCar).getHorsePower() == this.getHorsePower())
                && (this.racesWon != ((ShelbyMustang) theirCar).racesWon)) {
                if (((ShelbyMustang) theirCar).racesWon > this.racesWon) {
                    System.out.println(((ShelbyMustang) theirCar).getName()
                        + " won against " + this.getName());
                    ((ShelbyMustang) theirCar).racesWon += 1;
                } else {
                    System.out.println(this.getName()
                        + " won against " + theirCar.getName());
                    this.racesWon += 1;
                }
            } else if ((((ShelbyMustang) theirCar).getHorsePower() == this.getHorsePower())
                && (this.racesWon == ((ShelbyMustang) theirCar).racesWon)) {
                System.out.println(((ShelbyMustang) theirCar).getName()
                    + " tied with " + this.getName());
            }
        } else {
            System.out.println(theirCar.getName()
                + " could not race " + this.getName());
        }

    }

}