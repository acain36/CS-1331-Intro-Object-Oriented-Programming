/**
* This program takes in and sets values for prices of a mechanic.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-04
*/
public class Mechanic  {
    /**
    * Creates and assigns values to a mechanic object.
    * @param args imports args string array
    */
    public static void main(String[] args)  {

    }
    private final String name;
    private double revenue;
    private double oilChangePrice;
    private double newTirePrice;
    /**
    * Sets values for the mechanic and his prices.
    * @param name is the name of the mechanic
    * @param revenue the revenue of the mechanic
    * @param oilChangePrice is the prive for the oil change
    * @param newTirePrice is how much it costs to change the tires
    */
    public Mechanic(String name, double revenue, double oilChangePrice,
        double newTirePrice) {
        this.name = name;
        if (revenue < 0) {
            this.revenue = 0.0;
        } else {
            this.revenue = revenue;
        }
        if (oilChangePrice < 0.99) {
            this.oilChangePrice = 44.99;
        } else {
            this.oilChangePrice = oilChangePrice;
        }

        if (newTirePrice < 0.99) {
            this.newTirePrice = 59.99;
        } else {
            this.newTirePrice = newTirePrice;
        }
    }
    /**
    * Sets values for the mechanic and his prices.
    * @param name is the name of the mechanic
    * @param oilChangePrice is the prive for the oil change
    * @param newTirePrice is how much it costs to change the tires
    */
    public Mechanic(String name, double oilChangePrice, double newTirePrice) {
        this.name = name;
        this.revenue = 0.00;
        if (oilChangePrice < 0.99) {
            this.oilChangePrice = 44.99;
        } else {
            this.oilChangePrice = oilChangePrice;
        }

        if (newTirePrice < 0.99) {
            this.newTirePrice = 59.99;
        } else {
            this.newTirePrice = newTirePrice;
        }
    }
    /**
    * Sets values for the mechanic and his prices.
    * @param name is the name of the mechanic
    */
    public Mechanic(String name) {
        this.name = name;
        this.revenue = 0.00;
        this.oilChangePrice = 44.99;
        this.newTirePrice = 59.99;
    }
    /**
    * Sets values for the mechanic.
    * @param revenue revenue of the mechanic
    */
    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
    /**
    * Sets values for the mechanic.
    * @param oilChangePrice price of an oil change
    */
    public void setOilChangePrice(double oilChangePrice) {
        this.oilChangePrice = oilChangePrice;
    }
    /**
    * Sets values for the mechanic.
    * @param newTirePrice is the price of changing the tires
    */
    public void setNewTirePrice(double newTirePrice) {
        this.newTirePrice = newTirePrice;
    }
    /**
    * Returns values for the mechanic.
    * @return the value of name
    */
    public String getName() {
        return this.name;
    }
    /**
    * Returns values for the mechanic.
    * @return the value of revenus
    */
    public double getRevenue() {
        return this.revenue;
    }
    /**
    * Returns values for the mechanic.
    * @return the value of oilChangePrice
    */
    public double getOilChangePrice() {
        return this.oilChangePrice;
    }
    /**
    * Returns values for the mechanic.
    * @return the value of newTirePrice
    */
    public double getNewTirePrice() {
        return this.newTirePrice;
    }
    /**
    * Returns values for the mechanic.
    * @return String of values in the program
    */
    public String toString() {
        return "This is a mechanic named " + getName() + ". I charge $"
            + String.format("%.2f", getOilChangePrice()) + " for an oil change, and I charge $"
            + String.format("%.2f", getNewTirePrice()) + " for a new tire. I've made $"
            + String.format("%.2f", getRevenue()) + " in revenue";
    }
    /**
    * Takes in Car object and updates its values.
    * @param c updates the values for the object car called c
    */
    public void service(Car c) {
        if (c.getMileage() >= c.getNextOilChange()) {
            c.setNextOilChange(c.getMileage() + 3000);
            revenue += oilChangePrice;
        }
        double[] tires = c.getTireLife();
        for (int i = 0; i < tires.length; i++) {
            if (tires[i] <= 0.5) {
                revenue += newTirePrice;
                tires[i] = 1.00;
            }
        }
        c.setTireLife(tires);
    }
}