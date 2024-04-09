/**
* This program takes in and sets values for information regarding a car.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-04
*/
public class Car  {
    /**
    * Creates and assigns values to a car object.
    * @param args imports args string array
    */
    public static void main(String[] args) {
    }
    private String type;
    private int mileage;
    private int nextOilChange;
    private double[] tireLife;
    private static int numCars = 0;
    /**
    * Sets values for the car.
    * @param type the type of car
    * @param mileage the mileage of the car
    * @param nextOilChange how many miles until the oil is changed
    * @param tireLife array with how good the tire is 0.00 - 1.00
    */
    public Car(String type, int mileage, int nextOilChange, double[] tireLife) {
        this.type = type;
        if (mileage < 0)  {
            this.mileage = 0;
        } else {
            this.mileage = mileage;
        }
        if (nextOilChange < 0) {
            this.nextOilChange = this.mileage + 3000;
        } else {
            this.nextOilChange = nextOilChange;
        }
        for (int i = 0; i < tireLife.length; i++) {
            if (tireLife[i] > 1.00) {
                tireLife[i] = 1.00;
            } else if (tireLife[i] < 0.00) {
                tireLife[i] = 1.00;
            }
            tireLife[i] = tireLife[i];
        }
        this.tireLife = tireLife;
        this.numCars += 1;
    }
    /**
    * Sets values for the car.
    * @param type the type of car
    * @param mileage the mileage of the car
    * @param tireLife array with how good the tire is 0.00 - 1.00
    */
    public Car(String type, int mileage, double[] tireLife) {
        this.type = type;
        this.mileage = mileage;
        this.nextOilChange = mileage + 3000;
        for (int i = 0; i < tireLife.length; i++) {
            if (tireLife[i] > 1.00) {
                tireLife[i] = 1.00;
            } else if (tireLife[i] < 0.00) {
                tireLife[i] = 1.00;
            }
            tireLife[i] = tireLife[i];
        }
        this.tireLife = tireLife;
        this.numCars += 1;
    }
    /**
    * Sets values for the car.
    * @param type the type of car
    * @param tireLife array with how good the tire is 0.00 - 1.00
    */
    public Car(String type, double[] tireLife) {
        this.type = type;
        this.mileage = 0;
        this.nextOilChange = mileage + 3000;
        for (int i = 0; i < tireLife.length; i++) {
            if (tireLife[i] > 1.00) {
                tireLife[i] = 1.00;
            } else if (tireLife[i] < 0.00) {
                tireLife[i] = 1.00;
            }
            tireLife[i] = tireLife[i];
        }
        this.tireLife = tireLife;
        this.numCars += 1;
    }
    /**
    * Sets values for the car.
    * @param myCar is a car object containing information about the car
    */
    public Car(Car myCar) {
        this.tireLife = new double[4];
        for (int i = 0; i < 4; i++) {
            if (myCar.tireLife[i] > 1.00) {
                this.tireLife[i] = 1.00;
            } else if (myCar.tireLife[i] < 0.00) {
                this.tireLife[i] = 1.00;
            }
            this.tireLife[i] = myCar.tireLife[i];
        }
        this.type = myCar.getType();
        if (myCar.mileage < 0)  {
            this.mileage = 0;
        } else {
            this.mileage = myCar.mileage;
        }
        if (myCar.nextOilChange < 0) {
            this.nextOilChange = this.mileage + 3000;
        } else {
            this.nextOilChange = myCar.nextOilChange;
        }
        this.numCars += 1;
    }
    /**
    * Sets values for the car.
    * @param type the type of car
    */
    public void setType(String type) {
        this.type = type;
    }
    /**
    * Sets values for the car.
    * @param mileage the mileage of the car
    */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    /**
    * Sets values for the car.
    * @param nextOilChange how many miles until the oil is changed
    */
    public void setNextOilChange(int nextOilChange) {
        this.nextOilChange = nextOilChange;
    }
    /**
    * Sets values for the car.
    * @param tireLife array with how good the tire is 0.00 - 1.00
    */
    public void setTireLife(double[] tireLife) {
        this.tireLife = tireLife;
    }
    /**
    * Returns values for the car.
    * @return the value of type
    */
    public String getType() {
        return this.type;
    }
    /**
    * Returns values for the car.
    * @return the value of mileage
    */
    public int getMileage() {
        return this.mileage;
    }
    /**
    * Returns values for the car.
    * @return the value of nextOilChange
    */
    public int getNextOilChange() {
        return this.nextOilChange;
    }
    /**
    * Returns values for the car.
    * @return the value of tireLife
    */
    public double[] getTireLife() {
        return this.tireLife;
    }
    /**
    * Returns calculated average tireLife
    * @return the averages of all of the values of the tires in the array
    */
    private int averageTireLife() {
        double totalLife = 0;
        for (int i = 0; i < tireLife.length; i++) {
            totalLife  += tireLife[i];
        }
        return (int) ((double) (totalLife / 4) * 100);
    }
    /**
    * Returns values for the car.
    * @return String of values in the program
    */
    public String toString() {
        return "This is a car of type " + getType() + "with a mileage of "
            + getMileage() + " miles. I'm due for a checkup in "
            + (getNextOilChange() - getMileage()) + " miles, and my average tire life is "
            + averageTireLife() + ".";
    }
}