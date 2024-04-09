/**
* This concrete class implemets comparable of the type Monster.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-25
*/
public class Monster implements Comparable<Monster> {
    private String name;
    private int spookiness;

    /**
    * This is a constructor for the monster class.
    * @param name is a string representing the name of the monster
    * @param spookiness is a integer that represents the spookiness index of the monster
    */
    public Monster(String name, int spookiness) {
        this.name = name;
        this.spookiness = spookiness;
    }

    /**
    * This method gets the value of the spookiness of the monster.
    * @return the integer representing the spookiness
    */
    public int getSpookiness() {
        return this.spookiness;
    }

    /**
    * This method gets the value of the name of the monster.
    * @return the name representing the spookiness
    */
    public String getName() {
        return this.name;
    }

    /**
    * This method will compare two objects of type Monster.
    * Returns 1 if the current monster has greater spookiness than the one passed in.
    * Returns -1 if the monster passed in has a greater spookiness than the current one.
    * Returns 0 if the spookiness are equal.
    * @param m is the Monster object with which is being compared
    * @return an integer representing the equality of the two Monster Objects
    */
    public int compareTo(Monster m) {
        if (this.getSpookiness() > m.getSpookiness()) {
            return 1;
        } else if (this.getSpookiness() < m.getSpookiness()) {
            return -1;
        } else if (this.getSpookiness() == m.getSpookiness()) {
            return 0;
        }
        return 9999;
    }

    /**
    * This method returns a string with the name and spookiness of the monster.
    * @return a String containing the values of name and spookiness of the current monster
    */
    public String toString() {
        return this.name + " has a spook rating of " + this.getSpookiness();
    }
}