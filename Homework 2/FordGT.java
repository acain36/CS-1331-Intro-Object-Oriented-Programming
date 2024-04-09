/**
* This class extends Car and creates a FordGT to race.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-11
*/
public class FordGT extends Car {
    private double weight;
    private String driverName;

    /**
    * Sets values for the FordGT object.
    * @param name is the name of the the car
    * @param make the model of the car
    * @param fuelLevel is the fuel level of the car
    * @param horsepower represents how much horsepower the car has
    * @param previousUpgrade stores whether the car has been brought
    * in before
    * @param weight is an int that describes the weight of the car
    * @param driverName is a string that describes the name of
    * the driver
    */
    public FordGT(String name, String make, double fuelLevel,
        int horsepower, boolean previousUpgrade,
        double weight, String driverName) {
        super(name, make, fuelLevel, horsepower, previousUpgrade);
        this.weight = weight;
        this.driverName = driverName;
    }

    /**
    * Constructor with no arguments.
    */
    public FordGT() {
        this("Pony", "Ford", 100, 450, false, 3300, "Ken Miles");
    }

    /**
    * This toString will override that in Car and will return a string.
    * @return String that describes the car and driver
    */
    @Override
    public String toString() {
        return super.toString() + ", Weight: " + this.weight
            + ", Driver: " + this.driverName;
    }

    /**
    * This will override the equals method from Car.
    * @return a boolean describing relation between two FordGTs
    */
    @Override
    public boolean equals(Object newFord) {
        if (newFord == null) {
            return false;
        } else if (newFord instanceof FordGT) {
            return ((super.equals(newFord))
                && (((FordGT) newFord).weight == this.weight));
        } else {
            return false;
        }
    }

    /**
    * This method overrides the upgrade method located in the Car class.
    */
    @Override
    public void upgrade() {
        this.setFuelLevel(MAX_FUEL_LEVEL);
        if (!(this.getPreviousUpgrade())) {
            if (this.getHorsePower() < 200) {
                super.setHorsePower(this.getHorsePower() + 100);
            } else if (this.getHorsePower() >= 200) {
                super.setHorsePower(this.getHorsePower() + 50);
            }
        }
        this.setPreviousUpgrade(true);
    }

    /**
    * Writes abstract class of races() from Car.
    * Overrides this class to take in a parameter.
    * @param newCar is the car that will be racing
    */
    @Override
    public void race(Car newCar) {
        if ((newCar.getClass() == this.getClass())
            && (this.getFuelLevel() > 50)
            && (newCar.getFuelLevel() > 50)) {
            newCar.setFuelLevel(newCar.getFuelLevel() - 25.0);
            this.setFuelLevel(this.getFuelLevel() - 25.0);
            if (this.getHorsePower() > newCar.getHorsePower()) {
                System.out.println(this.getName() + " with "
                    + this.driverName + " as the driver won agaisnt "
                    + newCar.getName() + " with "
                    + ((FordGT) newCar).driverName + " as the driver");
            } else if (newCar.getHorsePower() > this.getHorsePower()) {
                System.out.println(newCar.getName() + " with "
                    + ((FordGT) newCar).driverName + " as the driver won agaisnt "
                    + this.getName() + " with "
                    + this.driverName + " as the driver");
            } else if ((newCar.getHorsePower() == this.getHorsePower())
                && (((FordGT) newCar).weight != this.weight)) {
                if (((FordGT) newCar).weight > this.weight) {
                    System.out.println(newCar.getName() + " with "
                        + ((FordGT) newCar).driverName + " as the driver won agaisnt "
                        + this.getName() + " with "
                        + this.driverName + " as the driver");
                } else {
                    System.out.println(this.getName() + " with "
                        + this.driverName + " as the driver won agaisnt "
                        + newCar.getName() + " with "
                        + ((FordGT) newCar).driverName + " as the driver");
                }
            } else {
                System.out.println(newCar.getName() + " tied with "
                    + this.getName());
            }
        } else {
            System.out.println(newCar.getName()
                + " could not race " + this.getName());
        }
    }
}