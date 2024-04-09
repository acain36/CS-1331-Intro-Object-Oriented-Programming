/**
* This class tests methods in GenericClass.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-19
*/
public class GenericsTester {
    
    /**
    * This method will test the GenericClass method.
    * @param args is a String array for the main method
    */
    public static void main(String[] args) {
        GenericClass chester = new GenericClass("CS1331", 1.0);
        System.out.println(chester.minimumVal("generics", "coding", "Comparable"));
        chester.printRandTimes(10);
    }
}