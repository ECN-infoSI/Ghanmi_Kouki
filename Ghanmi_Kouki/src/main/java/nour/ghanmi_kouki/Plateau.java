/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nour.ghanmi_kouki;

/**
 * Classe Plateau initialise le plateau de jeu
 * @author nourkouki
 */
public class Plateau {
    
    // attributs de la classe
    private static final int TAILLE = 8;
    public Pion[][] grille;

    /**
     * Constructeur de la classe Plateau. Initialise le plateau avec les positions initiales.
     */
    public Plateau() {
        grille = new Pion[TAILLE][TAILLE];
        initialiserPlateau();
    }
    
    /**
     * methode pour initialise le plateau avec des pions vides
     * et les 4 positions de départ.
     */
    private void initialiserPlateau() {
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                grille[i][j] = new Pion(Pion.Couleur.VIDE);
            }
        }
        grille[3][3].setCouleur(Pion.Couleur.BLANC);
        grille[3][4].setCouleur(Pion.Couleur.NOIR);
        grille[4][3].setCouleur(Pion.Couleur.NOIR);
        grille[4][4].setCouleur(Pion.Couleur.BLANC);
    }
    
    /**
     * Affichage du plateau dans la console.
     */
    public void afficherPlateau() {
        System.out.print("  ");
        for (int i = 0; i < TAILLE; i++) {
            System.out.print((char) ('a' + i) + " ");
        }
        System.out.println();

        for (int i = 0; i < TAILLE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < TAILLE; j++) {
                System.out.print(grille[i][j] + " ");
            }
            System.out.println();
        }
    }
     
}
