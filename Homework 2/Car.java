/**
* This abstract class creates a car and modifies its values.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-11
*/
public abstract class Car {
    private String name;
    private String make;
    private double fuelLevel;
    private int horsepower;
    private boolean previousUpgrade;
    protected static final double MAX_FUEL_LEVEL = 100.00;

    /**
    * Sets values for a car object.
    * @param name is the name of the the car
    * @param make the model of the car
    * @param fuelLevel is the fuel level of the car
    * @param horsepower represents how much horsepower the car has
    * @param previousUpgrade stores whether the car has been brought
    * in before
    */
    public Car(String name, String make, double fuelLevel,
        int horsepower, boolean previousUpgrade) {
        if (fuelLevel >  MAX_FUEL_LEVEL) {
            this.fuelLevel =  MAX_FUEL_LEVEL;
        } else {
            this.fuelLevel =  fuelLevel;
        }
        this.name = name;
        this.make = make;
        this.horsepower = horsepower;
        this.previousUpgrade = previousUpgrade;
    }

    /**
    * Returns boolean for previousUpgrade.
    * @return String of values in the program
    */
    public boolean getPreviousUpgrade() {
        return this.previousUpgrade;
    }

    /**b
    * Returns name for the car.
    * @return the String representing the name of the car
    */
    public String getName() {
        return this.name;
    }

    /**
    * Returns fuel level for the car.
    * @return the double representing the fuel level
    */
    public double getFuelLevel() {
        return this.fuelLevel;
    }

    /**
    * Returns horsepower for the car.
    * @return the integer representing the horsepower
    */
    public int getHorsePower() {
        return this.horsepower;
    }

    /**
    * Sets the fuel level for the car.
    * @param theFuel is the fuel level being set to the car
    */
    public void setFuelLevel(double theFuel) {
        this.fuelLevel = theFuel;
    }

    /**
    * Sets the horsepower for the car.
    * @param thehorsepower is the fuel level being set to the car
    */
    public void setHorsePower(int thehorsepower) {
        this.horsepower = thehorsepower;
    }

    /**
    * Sets whether a car has been upgraded.
    * @param hasUpgraded is the value for whether car has been upgraded
    */
    public void setPreviousUpgrade(boolean hasUpgraded) {
        this.previousUpgrade = hasUpgraded;
    }


    /**
    * Returns values for the car.
    * @return String of values in the program
    */
    public String toString() {
        return "Car named: " + this.name
            + ", Make: " + this.make
            + ", Fuel Amount: " + String.format("%.1f", this.fuelLevel)
            + ", HP: " + this.horsepower;
    }
    /**
    * This method tests if two cars are equal in aspects.
    * @param c is the Object that is being passed through
    */
    @Override
    public boolean equals(Object c) {
        if (c == null) {
            return false;
        } else if (c instanceof Car) {
            return (this.name.equals(((Car) c).name))
                && (this.make.equals(((Car) c).make))
                && (this.horsepower == (((Car) c).horsepower));
        } else {
            return false;
        }
    }

    /**
    * This method upgrades the car.
    */
    public void upgrade() {
        if (!(this.previousUpgrade)) {
            if (this.horsepower < 200) {
                this.horsepower += 100;
                this.previousUpgrade = true;
            } else {
                horsepower += 50;
                this.previousUpgrade = true;
            }
        } else {
            this.previousUpgrade = true;
        }
    }

    /**
    * This is an abstract class to be written later.
    * @param c is a car Object
    */
    public abstract void race(Car c);
}