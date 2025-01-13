package nour.ghanmi_kouki;

/**
 * Classe représentant les joueurs
 */
public class Player {
    private String name; //Nom du joueur
    private Pion.Couleur color; //couleur des pions du joueur
    /**
     * Constructeur de la classe Player
     * 
     * @param name: Name of the player
     * @param color: color of the player's pawns
     */
    public Player(String name, Pion.Couleur color){
        this.name= name;
        this.color = color;
    }
     /**
     * Getter pour le nom du joueur.
     *
     * @return nom du joueur.
     */
    public String getNom() {
        return this.name;
    }

    /**
     * Getter pour la couleur des pièces du joueurs.
     *
     * @return couleur des pièces du joueurs.
     */
    public Pion.Couleur getCouleur() {
        return color;
    }

    

}
