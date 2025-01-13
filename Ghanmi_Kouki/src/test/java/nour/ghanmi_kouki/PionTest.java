package nour.ghanmi_kouki;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PionTest {

    @Test
    void testSetCouleur() {
        System.out.println("setCouleur");
        
        // Création d'un pion vide
        Pion pion = new Pion(Pion.Couleur.VIDE);

        // Changer la couleur en NOIR
        pion.setCouleur(Pion.Couleur.NOIR);
        assertEquals(Pion.Couleur.NOIR, pion.getCouleur(), "La couleur du pion devrait être NOIR après modification");

        // Changer la couleur en BLANC
        pion.setCouleur(Pion.Couleur.BLANC);
        assertEquals(Pion.Couleur.BLANC, pion.getCouleur(), "La couleur du pion devrait être BLANC après modification");

        // Changer la couleur en VIDE
        pion.setCouleur(Pion.Couleur.VIDE);
        assertEquals(Pion.Couleur.VIDE, pion.getCouleur(), "La couleur du pion devrait être VIDE après modification");
    }

    @Test
    void testToString() {
        System.out.println("toString");
        
        // Pion de couleur NOIR
        Pion pionNoir = new Pion(Pion.Couleur.NOIR);
        assertEquals("N", pionNoir.toString(), "La représentation textuelle devrait être 'N' pour un pion NOIR");

        // Pion de couleur BLANC
        Pion pionBlanc = new Pion(Pion.Couleur.BLANC);
        assertEquals("B", pionBlanc.toString(), "La représentation textuelle devrait être 'B' pour un pion BLANC");

        // Pion vide
        Pion pionVide = new Pion(Pion.Couleur.VIDE);
        assertEquals(".", pionVide.toString(), "La représentation textuelle devrait être '.' pour un pion VIDE");
    }
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        
        // Création d'un pion de couleur NOIR
        Pion pionNoir = new Pion(Pion.Couleur.NOIR);
        assertEquals(Pion.Couleur.NOIR, pionNoir.getCouleur(), "La couleur du pion devrait être NOIR");

        // Création d'un pion de couleur BLANC
        Pion pionBlanc = new Pion(Pion.Couleur.BLANC);
        assertEquals(Pion.Couleur.BLANC, pionBlanc.getCouleur(), "La couleur du pion devrait être BLANC");

        // Création d'un pion vide
        Pion pionVide = new Pion(Pion.Couleur.VIDE);
        assertEquals(Pion.Couleur.VIDE, pionVide.getCouleur(), "La couleur du pion devrait être VIDE");
    }
}
