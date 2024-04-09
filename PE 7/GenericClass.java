import java.util.Arrays;
import java.util.Random;

/**
* This class uses methods to find largest and smallest values of generic values.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-19
*/
public class GenericClass <T extends Comparable<T>, E>{
    private T compVal;
    private E val;

    /**
    * This method will set the compVal and val of a GenericClass.
    * @param compVal is the value for compVal of type T
    * @param val is the value for val of type E
    */
    public GenericClass(T compVal, E val) {
        this.compVal = compVal;
        this.val = val;
    }

    /**
    * This method will use compareTo to find the largest T in an array.
    * @param theArray is an array of objects of type T
    * @return the largest object in the array of type T
    */
    public T biggest(T[] theArray) {
        T largestObject = theArray[0];
        if (theArray.length > 1) {
            for (int i = 0; i < theArray.length; i++) {
                if (theArray[i].compareTo(theArray[i+1]) < 0) {
                    largestObject = theArray[i+1];
                }
            }
        }
        return largestObject;
    }

    /**
    * This method will find index of val in an array.
    * @param theArray is an array of objects of type E
    * @return the index of the instance or negative one
    */
    public int getValueIndex(E[] theArray) {
        int theIndex = -1;
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] == val) {
                theIndex = i;
            }
        }
        return theIndex;
    }

    /**
    * This method will use compareTo to find the largest T out of a group.
    * @param one is an object of type T
    * @param two is an object of type T
    * @param three is an object of type T
    * @return the minimum of the three objects and compVal
    */
    public T minimumVal(T one, T two, T three) {
        T minimumVal = one;
        if (minimumVal.compareTo(two) > 0) {
            minimumVal = two;
        }
        if (minimumVal.compareTo(three) > 0) {
            minimumVal = three;
        }
        if (minimumVal.compareTo(compVal) > 0) {
            minimumVal = this.compVal;
        }
        return minimumVal;
    }

    /**
    * This method will print val and compVal a random number of times.
    * @param max is the max times to be printed
    */
    public void printRandTimes(int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max) + 1;
        int randomNumber2 = random.nextInt(max) + 1;
        for (int i = 0; i < randomNumber; i++) {
            System.out.print(compVal + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < randomNumber2; i++) {
            System.out.print(val + " ");
        }
    }
}