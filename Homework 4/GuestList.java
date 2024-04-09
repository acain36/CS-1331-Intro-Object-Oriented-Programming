import java.util.ArrayList;
/**
* This method organizes an ArrayList in ascending order and allows for compaison.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-25
*/
public class GuestList {
    private ArrayList<Monster> guests;
    private DancingMonster bestDancer;

    /**
    * This constructor takes in an ArrayList of Monster Objects.
    * @param guests is the ArrayList of monsters
    */
    public GuestList(ArrayList<Monster> guests) {
        if (guests == null) {
            this.guests.clear();
        } else if (guests.size() > 1) {
            boolean areDancingMonsters = false;
            int n = guests.size();

            /**
            * Will make the boolean true if there exists at least one DancingMonster object.
            */
            for (int a = 0; a < n; a++) {
                if (guests.get(a) instanceof DancingMonster) {
                    areDancingMonsters = true;
                }
            }

            /**
            * Will order the list of Monster objects through Bubble Sort Method, given that there
            * is at least one DancingMonster object.
            */
            if (areDancingMonsters) {
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (guests.get(j).compareTo(guests.get(j + 1)) == 1) {
                            Monster temp = guests.get(j);
                            guests.set(j, guests.get(j + 1));
                            guests.set(j + 1, temp);
                        }
                    }
                }

                /**
                * Will first create a new Array List to be that of only DancingMonster objects.
                * Will not change the guests list.
                * Will set the bestDancer to the first instance of an object with the largest spookiness.
                */
                int numDancingMonsters = 0;
                for (int z = 0; z < guests.size(); z++) {
                    if (guests.get(z) instanceof DancingMonster) {
                        numDancingMonsters++;
                    }
                }
                ArrayList<Monster> theDancingMonsters = new ArrayList<>(numDancingMonsters);
                for (int g = 0; g < guests.size(); g++) {
                    if (guests.get(g) instanceof DancingMonster) {
                        theDancingMonsters.add(guests.get(g));
                    }
                }

                if (numDancingMonsters > 1) {
                    int maxSpookiness = theDancingMonsters.get(theDancingMonsters.size() - 1).getSpookiness();
                    for (int s = 0; s < theDancingMonsters.size(); s++) {
                        if (theDancingMonsters.get(s).getSpookiness() == maxSpookiness) {
                            this.bestDancer = (DancingMonster) (theDancingMonsters.get(s));
                            break;
                        }
                    }
                } else if (numDancingMonsters == 1) {
                    this.bestDancer = (DancingMonster) (theDancingMonsters.get(0));
                }

            }
        /**
        * Will set bestDancer to null if there are no DancingMonster objects.
        */
            if (!areDancingMonsters) {
                this.bestDancer = null;
            }
            this.guests = guests;

        } else if (guests.size() == 0) {
            this.guests = guests;
            this.bestDancer = null;
        } else if (guests.size() == 1) {
            this.guests = guests;
            if (guests.get(0) instanceof DancingMonster) {
                this.bestDancer = (DancingMonster) (guests.get(0));
            } else {
                this.bestDancer = null;
            }
        }
    }

    /**
    * This constructor takes in no paramters and sets guests and bestDancer to empty/null.
    */
    public GuestList() {
        this.guests = new ArrayList<>(0);
        this.bestDancer = null;
    }

    /**
    * This method will take in a Monster object that will be added to the end of guests.
    * @param newM is the Monster object to be added to the end of guests ArrayList
    */
    public void addGuest(Monster newM) {
        guests.add(newM);
        if (newM instanceof DancingMonster) {
            if (bestDancer == null) {
                this.bestDancer = (DancingMonster) (newM);
            } else if (newM.compareTo(bestDancer) == 1) {
                this.bestDancer = (DancingMonster) (newM);
            }
        }
    }

    /**
    * This method will return a string of the names of the guests as they appear in the guests ArrayList.
    * @return a String of the names of the monsters in the list
    */
    public String toString() {
        String returnString = "";
        if (guests.size() > 0) {
            for (int i = 0; i < this.guests.size() - 1; i++) {
                returnString += guests.get(i).getName() + ", ";
            }
            returnString += guests.get(guests.size() - 1).getName();
        }
        return returnString;
    }

    /**
    * This method will take in two monsters and have them dance battle eachother.
    * @param monster1 will be the first Monster object
    * @param monster2 will be the second Monster object
    */
    public void danceBattle(Monster monster1, Monster monster2) {
        System.out.println(monster1.toString());
        System.out.println(monster2.toString());

        if ((monster1 instanceof DancingMonster) && (!(monster2 instanceof DancingMonster))) {
            System.out.println(monster1.getName() + " won the dance battle!");
            ((DancingMonster) monster1).wonDance();
        } else if ((monster2 instanceof DancingMonster) && (!(monster1 instanceof DancingMonster))) {
            System.out.println(monster2.getName() + " won the dance battle!");
            ((DancingMonster) monster2).wonDance();
        } else if ((!(monster2 instanceof DancingMonster)) && (!(monster1 instanceof DancingMonster))) {
            System.out.println("And this dance battle is a tie!");
        } else if ((monster2 instanceof DancingMonster) && (monster1 instanceof DancingMonster)) {
            if (((DancingMonster) monster1).dance() > ((DancingMonster) monster2).dance()) {
                System.out.println(monster1.getName() + " won the dance battle!");
                ((DancingMonster) monster1).wonDance();
            } else if (((DancingMonster) monster2).dance() > ((DancingMonster) monster1).dance()) {
                System.out.println(monster2.getName() + " won the dance battle!");
                ((DancingMonster) monster2).wonDance();
            } else if (((DancingMonster) monster2).dance() == ((DancingMonster) monster1).dance()) {
                System.out.println("And this dance battle is a tie!");
            }
        }
    }
}