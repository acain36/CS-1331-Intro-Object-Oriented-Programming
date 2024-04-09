import java.util.ArrayList;

/**
* This class determines the number of activiites that can be bought with a given budget.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-08
*/
public class UndercoverTourist {
    
    /**
    * This method will return an integer number of the number of activities able to be purchased.
    * @param theActivities is an ArrayList filled with activities
    * @param budget is a double representing the budget
    * @param numActivities is an integer representing the number of activities you have purchased
    * @return an integer representing the largest number of activities you could purchase
    */
    public static int calculateNumActivities(ArrayList<TravelActivity> theActivities
        , double budget, int currentNum) {

        if (theActivities.size() == 0) {
            return currentNum;
        } else {
            double cheapestPrice = theActivities.get(0).getPrice();
            int cheapestIndex = 0;
            for (int i = 0; i < theActivities.size(); i++) {
                if (theActivities.get(i).getPrice() < cheapestPrice) {
                    cheapestPrice = theActivities.get(i).getPrice();
                    cheapestIndex = i;
                }
            }
            if (cheapestPrice <= budget) {
                budget -= cheapestPrice;
                theActivities.remove(cheapestIndex);
                return 1 + calculateNumActivities(theActivities, budget, currentNum);
            } else {
                return currentNum;
            }
        }
    }

    /**
    * This main method will test the code.
    * @param args is the String Array for main method
    */
    public static void main(String[] args) {
        ArrayList<TravelActivity> availableActivities = new ArrayList<>();
        TravelActivity act1 = new TravelActivity("swim", 3.0);
        TravelActivity act2 = new TravelActivity("fish", 7.0);
        TravelActivity act3 = new TravelActivity("climb", 5.0);
        TravelActivity act4 = new TravelActivity("hike", 1.0);
        availableActivities.add(act1);
        availableActivities.add(act2);
        availableActivities.add(act3);
        availableActivities.add(act4);
        //System.out.println(calculateNumActivities(availableActivities, 1.0, 0));
        //System.out.println(calculateNumActivities(availableActivities, 5.0, 0));
        //System.out.println(calculateNumActivities(availableActivities, 0.0, 0));
        //System.out.println(calculateNumActivities(availableActivities, 40.0, 0));
        //System.out.println(availableActivities.size());
    }
}