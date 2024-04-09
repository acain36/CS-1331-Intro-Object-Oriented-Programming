/**
* This class creates a ProfessionalPlayer and modifies its values.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-01
*/
public class ProfessionalPlayer extends Player {
    private boolean isSeeded;

    /**
    * This constructor sets the name, points, trophies and isSeeded for a ProfessionalPlayer.
    * @param name is the name of the player
    * @param points is the number of points accumulated over the year by a player
    * @param trophies is the number of trophies won by the player in the previous year
    * @param isSeeded is a boolean depending on whether the player was ranked in the top 10
    */
    public ProfessionalPlayer(String name, double points, int trophies, boolean isSeeded) {
        super(name, points, trophies);
        this.isSeeded = isSeeded;
    }

    /**
    * This class will return a double representing skill level of a player.
    * @return A double representing the skill level
    */
    @Override
    public double calculateSkillLevel() {
        if (this.isSeeded) {
            return 2 * (this.getPoints() + 1.5 * this.getTrophies());
        } else {
            return this.getPoints() + 1.5 * this.getTrophies();
        }
    }

    /**
    * This methos will take in a Player object and override the equals method.
    * @param pP1 is the Object to be taken in
    * @return an boolean based on whether the two have the same name, points and trophies
    */
    @Override
    public boolean equals(Object pP1) {
        if (pP1 instanceof ProfessionalPlayer) {
            if (super.equals(pP1) && (Boolean.compare(this.isSeeded, ((ProfessionalPlayer) pP1).isSeeded) == 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}