/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nour.ghanmi_kouki;

/**
 * Classe représentant un pion dans le jeu Othello.
 * Un pion peut être de couleur noire, blanche ou vide (sans couleur).
 * @author nourkouki
 */
public class Pion {
    
    /**
     * Enumération représentant les couleurs possibles d'un pion.
     */
    
    public enum Couleur {
        NOIR, BLANC, VIDE
    }
    // attributs de la classe
    private Couleur couleur;

    /**
     * Constructeur de la classe Pion.
     *
     * @param couleur La couleur initiale du pion.
     */
    public Pion(Couleur couleur) {
        this.couleur = couleur;
    }

    

    
}
