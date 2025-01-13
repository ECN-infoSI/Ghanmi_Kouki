package nour.ghanmi_kouki;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires pour la classe Player.
 */
public class PlayerTest {

    /**
     * Teste le constructeur et la méthode getNom().
     * Vérifie que le nom du joueur est bien défini lors de la création de l'objet.
     */
    @Test
    void testPlayerConstructorAndGetNom() {
        // Crée un joueur avec un nom spécifique
        Player player = new Player("Alice", Pion.Couleur.BLANC);

        // Vérifie que la méthode getNom() retourne le nom attendu
        assertEquals("Alice", player.getNom(), "Le nom du joueur devrait être Alice.");
    }

    /**
     * Teste la méthode getCouleur().
     * Vérifie que la couleur du joueur est bien définie lors de la création de l'objet.
     */
    @Test
    void testGetCouleur() {
        // Crée un joueur avec une couleur spécifique
        Player player = new Player("Bob", Pion.Couleur.NOIR);

        // Vérifie que la méthode getCouleur() retourne la couleur attendue
        assertEquals(Pion.Couleur.NOIR, player.getCouleur(), "La couleur du joueur devrait être noire.");
    }
}
