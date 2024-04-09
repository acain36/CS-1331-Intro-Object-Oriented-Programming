/**
* This mathod extends Monster and implements danceable.
* @author Ashley Cain
* @version 1.0
* @since   2021-03-25
*/
public class DancingMonster extends Monster implements Danceable {
    private String danceMove;
    private int dancesWon;

    /**
    * This method will set the name, spookiness, danceMove and dancesWon with with super constructor.
    * @param name is the name of the monster
    * @param spookiness is the integer value of the spookiness of the monster
    * @param danceMove is the name of the dance move
    */
    public DancingMonster(String name, int spookiness, String danceMove) {
        super(name, spookiness);
        this.danceMove = danceMove;
        this.dancesWon = 0;
    }

    /**
    * This method returns an integer through implementation of the dance method.
    * @return an integer
    */
    @Override
    public int dance() {
        int randomInteger = (int) (Math.random() * this.getSpookiness());
        System.out.println(this.getName() + " does the " + this.danceMove);
        return randomInteger;
    }

    /**
    * This method overrides the one in Danceable and increments dancesWon by 1.
    */
    @Override
    public void wonDance() {
        this.dancesWon++;
    }

    /**
    * This method will return the values of name, spookiness and dancesWon by the monster.
    * @return a string containing the values of name, spookiness and dancesWon by the monster
    */
    public String toString() {
        return this.getName() + " has a spook rating of "
            + this.getSpookiness() + " and has won "
            + this.dancesWon + " dances thus far";
    }
}