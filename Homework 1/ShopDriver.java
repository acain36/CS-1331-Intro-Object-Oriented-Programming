/**
* This program calls methods from the Car and Mechanic programs.
* Inputted values in for the tire array that were out of range to
* check car program.
*
* @author Ashley Cain
* @version 1.0
* @since   2021-03-04
*/

public class ShopDriver {
    /**
    * Uses mechanic and car programs.
    * @param args imports args string array
    */
    public static void main(String[] args) {
        double[] tires = new double[]{0.7, 0.32, 0.45, 0.5};
        Car c1 = new Car("SUV", 15000, 14600, tires);
        Mechanic m1 = new Mechanic("Raul");
        m1.service(c1);
        System.out.println(m1);
        System.out.println(c1);
    }
}