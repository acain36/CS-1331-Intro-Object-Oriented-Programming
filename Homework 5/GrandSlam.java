import java.util.ArrayList;

/**
* This class creates a GrandSLam Tournament ArrayList and will sort and search for the Players.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-01
*/
public class GrandSlam {
    private String name;
    private ArrayList<ProfessionalPlayer> leaderboard;

    /**
    * This constructor sets values for the GrandSlam Tournament.
    * @param name is the name of the tournament
    * @param leaderboard is an unorganized list of the Players in the tournament
    */
    public GrandSlam(String name, ArrayList<ProfessionalPlayer> leaderboard) {
        this.name = name;
        this.leaderboard = leaderboard;
        this.createLeaderboard();
    }

    /**
    * This method will order the leaderboard of ProfessionalPlayers.
    */
    public void createLeaderboard() {
        for (int i = 0; i < leaderboard.size() - 1; i++) {
            int sortPosValue = i;
            int maxValueIndex = i;
            for (int j = i + 1; j < leaderboard.size(); j++) {
                if (leaderboard.get(j).compareTo(leaderboard.get(maxValueIndex)) == 1) {
                    maxValueIndex = j;
                }
            }
            ProfessionalPlayer temp = leaderboard.get(sortPosValue);
            leaderboard.set(sortPosValue, leaderboard.get(maxValueIndex));
            leaderboard.set(maxValueIndex, temp);
        }
    }

    /**
    * This method will search for a ProfessionalPlayer Object and return the index.
    * @param findThisPlayer is the ProfessionalPlayer object to find
    * @return an integer representing the index of the object
    */
    public int findPlayer(ProfessionalPlayer findThisPlayer) {
        int min = 0;
        int max = leaderboard.size() - 1;
        while (min <= max) {
            int middle = (max + min) / 2;
            if (leaderboard.get(middle).compareTo(findThisPlayer) == 1) {
                min = middle + 1;
            } else if (leaderboard.get(middle).compareTo(findThisPlayer) == -1) {
                max = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
    * This method will return a String with information about the GrandSlam tournament.
    * @return a String with GrandSlam tournament information
    */
    public String toString() {
        return "Welcome to the " + this.name + " tournament! The current leaderboard is "
            + this.leaderboard.toString();
    }
}