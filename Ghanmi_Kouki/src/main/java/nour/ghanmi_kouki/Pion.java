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
   
    
    /**
     * Getteur pour retourner la couleur actuelle du pion.
     *
     * @return La couleur du pion.
     */
    public Couleur getCouleur() {
        return couleur;
    }
    
    /**
     * Setteur pour définir une nouvelle couleur pour le pion
     * ceci est particulièrement util lors des captures des pions
     * 
     * @param couleur La nouvelle couleur à attribuer au pion.
     */
    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }
    
    

    
   
}
