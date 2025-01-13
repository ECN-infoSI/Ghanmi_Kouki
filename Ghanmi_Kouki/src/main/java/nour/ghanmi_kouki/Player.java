package nour.ghanmi_kouki;

/*
 * Class to represent the players of the game
 */
public class Player {
    private String name; //name of the player
    private Pawn.Color color; //Enum defined in class Pawn
    /*
     * Constructor of the class player
     * 
     * @param name: Name of the player
     * @param color: color of the player's pawns
     */
    public Player(String name, Pawn.color color){
        this.name= name;
        this.color = color;
    }


}
