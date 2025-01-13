package nour.ghanmi_kouki;
/**
 * Classe pour gérer la logique du jeu
 */
public class Game {
    private Plateau plateau; // Plateeau du jeu
    private Player wPlayer; // Joueur avec les pièces blanches
    private Player bPlayer; // Joueur avec les pièces noires
    private Player CurrPlayer; // Joueur du tour en cours

/**
 * Constructs a game of Othello with two players.
 *
 * @param bPlayerName  nom du joueur avec les pions noirs.
 * @param wPlayerName nom du joueur avec les pions blancs.
 */
public Game(String wPlayerName, String bPlayerName) {
    this.plateau = new Plateau();
    this.wPlayer = new Player(wPlayerName, Pion.Couleur.NOIR);
    this.bPlayer = new Player(bPlayerName, Pion.Couleur.BLANC);
    this.CurrPlayer = bPlayer; // Noir commence le jeu.
}
}