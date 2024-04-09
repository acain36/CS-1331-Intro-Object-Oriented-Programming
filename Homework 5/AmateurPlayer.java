/**
* This class creates an AmateurPlayer and modifies its values.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-01
*/
public class AmateurPlayer extends Player {

    /**
    * This constructor takes in the name, points and trophies of an AmateurPlayer.
    * @param name is the name of the player
    * @param points is the number of points accumulated over the year by a player
    * @param trophies is the number of trophies won by the player in the previous year
    */
    public AmateurPlayer(String name, double points, int trophies) {
        super(name, points, trophies);
    }

    /**
    * This class will return a double representing skill level of a player.
    * @return A double representing the skill level
    */
    @Override
    public double calculateSkillLevel() {
        return this.getPoints() + 0.5 * this.getTrophies();
    }
}