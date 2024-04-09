import java.util.ArrayList;

/**
* This class creates a Masters Tournament ArrayList and will sort and search for the Players.
* @author Ashley Cain
* @version 1.0
* @since   2021-04-01
*/
public class Masters {
    private String name;
    private ArrayList<Player> leaderboard;

    /**
    * This constructor sets values for the tournament.
    * @param name is the name of the tournament
    * @param leaderboard is an unorganized list of the Players in the tournament
    */
    public Masters(String name, ArrayList<Player> leaderboard) {
        this.name = name;
        this.leaderboard = leaderboard;
    }

    /**
    * This method will sort an array of Players using the Insertion Sort Algorithm.
    */
    public void createLeaderboard() {
        int n = leaderboard.size();
        for (int i = 1; i < n; i++) {
            Player temp = leaderboard.get(i);
            int j = i - 1;
            while (j >= 0 && (leaderboard.get(j).compareTo(temp) == -1)) {
                leaderboard.set(j + 1, leaderboard.get(j));
                j--;
            }
            leaderboard.set(j + 1, temp);
        }
    }

    /**
    * This method will find the Player that is passed in and return the index of the Object.
    * @param playerToFind is the player passed in to be found
    * @return an integer representing the index of the Player
    */
    public int findPlayer(Player playerToFind) {
        int n = leaderboard.size();
        for (int i = 0; i < n; i++) {
            if (leaderboard.get(i).compareTo(playerToFind) == 0) {
                return i;
            }
        }
        return -1;
    }

    /**
    * This method will return a String with information about the tournament.
    * @return a String with tournament information
    */
    public String toString() {
        return "Welcome to the " + this.name + " tournament! The current leaderboard is "
            + this.leaderboard.toString();
    }
}