/**
* This abstract class creates a Player and modifies its values.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-01
*/
public abstract class Player implements Comparable<Player> {
    private String name;
    private double points;
    private int trophies;

    /**
    * This constructor takes in the name, points and trophies of a player.
    * @param name is the name of the player
    * @param points is the number of points accumulated over the year by a player
    * @param trophies is the number of trophies won by the player in the previous year
    */
    public Player(String name, double points, int trophies) {
        this.name = name;
        this.points = points;
        this.trophies = trophies;
    }

    /**
    * This abstract class will return a double.
    * @return A double representing the skill level
    */
    public abstract double calculateSkillLevel();

    /**
    * This methos will take in a Player object and override the compareTo method from comparable.
    * @param p1 is the player object to be taken in
    * @return an integer based on which Player object has a greater skill level
    */
    @Override
    public int compareTo(Player p1) {
        if (this.calculateSkillLevel() > p1.calculateSkillLevel()) {
            return 1;
        } else if (this.calculateSkillLevel() < p1.calculateSkillLevel()) {
            return -1;
        } else if (this.calculateSkillLevel() == p1.calculateSkillLevel()) {
            return 0;
        }
        return 9999;
    }

    /**
    * This methos will take in a Player object and override the equals method.
    * @param p1 is the Object to be taken in
    * @return an boolean based on whether the two have the same name, points and trophies
    */
    @Override
    public boolean equals(Object p1) {
        if (p1 == null) {
            return false;
        } else if (p1 instanceof Player) {
            return (this.name.equals(((Player) p1).name))
                && (this.points == ((Player) p1).points)
                && (this.trophies == (((Player) p1).trophies));
        } else {
            return false;
        }
    }

    /**
    * This method will return a String containing information about the player.
    * @return a String with this information
    */
    public String toString() {
        return this.getName() + ": " + String.format("%,.1f", this.getPoints()) + " points - "
            + this.getTrophies() + " trophies";
    }

    /**
    * This method will retrieve the name of a player.
    * @return a String representing the name of the Player
    */
    public String getName() {
        return this.name;
    }

    /**
    * This method will retrieve the number of points of a player.
    * @return a double representing the number of points won by the Player
    */
    public double getPoints() {
        return this.points;
    }

    /**
    * This method will retrieve the number of trophies of a player.
    * @return an integer representing the number of trophies won by the Player
    */
    public int getTrophies() {
        return this.trophies;
    }
}