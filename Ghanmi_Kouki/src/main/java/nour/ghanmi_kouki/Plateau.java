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
    public void initialiserPlateau() {
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
    
    /**
     * méthode pour vérifie si les indices donnés sont valides et qu'on ne dépasse
     * pas les limites du plateau
     *
     * @param ligne   L'indice de la ligne.
     * @param colonne L'indice de la colonne.
     * @return true si les indices sont valides, false sinon.
     */
    public boolean indicesValides(int ligne, int colonne) {
        return ligne >= 0 && ligne < TAILLE && colonne >= 0 && colonne < TAILLE;
    }
    
    /**
     * Vérifie si un pion peut capturer dans une direction donnée.
     *
     * @param ligne   L'indice de la ligne.
     * @param colonne L'indice de la colonne.
     * @param dx      Direction en x.
     * @param dy      Direction en y.
     * @param couleur La couleur du pion à jouer.
     * @return true si une capture est possible dans la direction donnée, false sinon.
     */
    private boolean peutCapturerDansDirection(int ligne, int colonne, int dx, int dy, Pion.Couleur couleur) {
        int x = ligne + dx;
        int y = colonne + dy;
        boolean pionAdverseTrouvee = false;

        while (indicesValides(x, y)) {
            if (grille[x][y].getCouleur() == Pion.Couleur.VIDE) {
                return false;
            }
            if (grille[x][y].getCouleur() == couleur) {
                return pionAdverseTrouvee;
            }
            pionAdverseTrouvee = true;
            x += dx;
            y += dy;
        }
        return false;
    }
    
    /**
     * Méthode pour vérifier si un coup est valide.
     *
     * @param ligne   L'indice de la ligne.
     * @param colonne L'indice de la colonne.
     * @param couleur La couleur du pion à jouer.
     * @return true si le coup est valide, false sinon.
     */
    public boolean estCoupValide(int ligne, int colonne, Pion.Couleur couleur) {
        if (!indicesValides(ligne, colonne) || grille[ligne][colonne].getCouleur() != Pion.Couleur.VIDE) {
            return false;
        }

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx == 0 && dy == 0) continue;
                if (peutCapturerDansDirection(ligne, colonne, dx, dy, couleur)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * méthode pour retourne les pions capturés dans une direction donnée.
     *
     * @param ligne   L'indice de la ligne.
     * @param colonne L'indice de la colonne.
     * @param dx      Direction en x.
     * @param dy      Direction en y.
     * @param couleur La couleur du pion à jouer.
     */
    private void retournerPionsDansDirection(int ligne, int colonne, int dx, int dy, Pion.Couleur couleur) {
        int x = ligne + dx;
        int y = colonne + dy;

        while (grille[x][y].getCouleur() != couleur) {
            grille[x][y].setCouleur(couleur);
            x += dx;
            y += dy;
        }
    }
    
    
     
}
