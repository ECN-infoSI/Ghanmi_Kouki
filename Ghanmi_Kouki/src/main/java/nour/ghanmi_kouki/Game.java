package nour.ghanmi_kouki;

import java.util.Scanner;

/**
 * Classe pour gérer la logique du jeu
 */
public class Game {
    private Plateau plateau; // Plateeau du jeu
    private Player wPlayer; // Joueur avec les pièces blanches
    private Player bPlayer; // Joueur avec les pièces noires
    private Player CurrPlayer; // Joueur du tour en cours

/**
 * Constructeur d'une partie Othello avec les deux joueurs.
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
    
    /**
     * Test si joueur a des coups valides à jouer
     *
     * @param joueur joueur
     * @return true si le joueur peut jouer un coup false sinon
     */
    private boolean joueurPeutJouer(Player joueur) {
        Pion.Couleur couleur = joueur.getCouleur();
    
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (plateau.estCoupValide(i, j, couleur)) {
                    return true;
                }
            }
        }
        return false;
    }
    
/**
 * Montre le nombre de pièces pour chaque joueur 
 * et le joueur qui a gagné
 */
private void afficherResultat() {
    int scoreNoir = 0;
    int scoreBlanc = 0;

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (plateau.getGrille()[i][j].getCouleur() == Pion.Couleur.NOIR) {
                scoreNoir++;
            } else if (plateau.getGrille()[i][j].getCouleur() == Pion.Couleur.BLANC) {
                scoreBlanc++;
            }
        }
    }

    System.out.println("Final Score:");
    System.out.println(this.bPlayer.getNom() + " (Black): " + scoreNoir);
    System.out.println(this.wPlayer.getNom() + " (White): " + scoreBlanc);

    if (scoreNoir > scoreBlanc) {
        System.out.println("Winner: " + this.bPlayer.getNom() + " (Black)");
    } else if (scoreBlanc > scoreNoir) {
        System.out.println("Winner: " + this.wPlayer.getNom() + " (White)");
    } else {
        System.out.println("It's a tie!");
    }
}
}