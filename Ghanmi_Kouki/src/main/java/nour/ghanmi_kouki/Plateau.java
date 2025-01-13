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
    private Pion[][] grille;

    /**
     * Constructeur de la classe Plateau. Initialise le plateau avec les positions initiales.
     */
    public Plateau() {
        grille = new Pion[TAILLE][TAILLE];
    }
   

    
    
}
