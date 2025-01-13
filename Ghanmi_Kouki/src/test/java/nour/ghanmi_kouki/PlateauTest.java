package nour.ghanmi_kouki;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires pour la classe Plateau.
 */
public class PlateauTest {

    /**
     * Teste le constructeur de la classe Plateau et la méthode initialiserPlateau().
     * Vérifie si le plateau est correctement initialisé avec les positions de départ des pions.
     */
    @Test
    void testInitialiserPlateau() {
        Plateau plateau = new Plateau();
        
        // Vérifie que les 4 positions centrales sont correctement initialisées
        assertEquals(Pion.Couleur.BLANC, plateau.grille[3][3].getCouleur(), "Le pion en (3, 3) devrait être blanc.");
        assertEquals(Pion.Couleur.NOIR, plateau.grille[3][4].getCouleur(), "Le pion en (3, 4) devrait être noir.");
        assertEquals(Pion.Couleur.NOIR, plateau.grille[4][3].getCouleur(), "Le pion en (4, 3) devrait être noir.");
        assertEquals(Pion.Couleur.BLANC, plateau.grille[4][4].getCouleur(), "Le pion en (4, 4) devrait être blanc.");
    }

    /**
     * Teste la méthode indicesValides().
     * Vérifie que les indices valides et invalides sont correctement traités.
     */
    @Test
    void testIndicesValides() {
        Plateau plateau = new Plateau();
        
        // Teste des indices valides
        assertTrue(plateau.indicesValides(0, 0), "Les indices (0, 0) devraient être valides.");
        assertTrue(plateau.indicesValides(7, 7), "Les indices (7, 7) devraient être valides.");
        
        // Teste des indices invalides
        assertFalse(plateau.indicesValides(-1, 0), "Les indices (-1, 0) devraient être invalides.");
        assertFalse(plateau.indicesValides(0, 8), "Les indices (0, 8) devraient être invalides.");
    }

    /**
     * Teste la méthode peutCapturerDansDirection().
     * Vérifie si un pion peut capturer dans une direction donnée.
     */
    @Test
    void testPeutCapturerDansDirection() {
        Plateau plateau = new Plateau();
        
        // Test pour une direction où la capture est possible
        // Cette logique dépend de la configuration du plateau et de la couleur des pions
        assertTrue(plateau.peutCapturerDansDirection(2, 3, 1, 0, Pion.Couleur.NOIR), 
            "Le pion noir devrait pouvoir capturer dans la direction (1, 0).");

        // Test pour une direction où la capture est impossible
        assertFalse(plateau.peutCapturerDansDirection(3, 3, -1, 0, Pion.Couleur.NOIR),
            "Le pion noir ne devrait pas pouvoir capturer dans la direction (-1, 0).");
    }

    /**
     * Teste la méthode estCoupValide().
     * Vérifie si un coup donné est valide selon la règle du jeu.
     */
    @Test
    void testEstCoupValide() {
        Plateau plateau = new Plateau();
        
        // Test un coup valide pour un pion noir
        assertTrue(plateau.estCoupValide(2, 3, Pion.Couleur.NOIR), 
            "Le coup en (2, 3) devrait être valide pour le pion noir.");

        // Test un coup invalide pour un pion noir
        assertFalse(plateau.estCoupValide(0, 0, Pion.Couleur.NOIR), 
            "Le coup en (0, 0) devrait être invalide pour le pion noir.");
        
        // Test un coup valide pour un pion blanc
        assertTrue(plateau.estCoupValide(5, 3, Pion.Couleur.BLANC), 
            "Le coup en (5, 3) devrait être valide pour le pion blanc.");
        
        // Test un coup invalide pour un pion blanc
        assertFalse(plateau.estCoupValide(0, 0, Pion.Couleur.BLANC), 
            "Le coup en (0, 0) devrait être invalide pour le pion blanc.");
    }

    /**
     * Teste la méthode jouerCoup().
     * Vérifie si un coup est correctement joué et les pions retournés.
     */
    @Test
    void testJouerCoup() {
        Plateau plateau = new Plateau();
        
        // Test un coup valide pour un pion noir
        plateau.jouerCoup(2, 3, Pion.Couleur.NOIR);
        assertEquals(Pion.Couleur.NOIR, plateau.grille[2][3].getCouleur(), 
            "Le pion en (2, 3) devrait être noir après avoir joué.");
        
        // Test un coup invalide (devrait lancer une exception)
        try {
            plateau.jouerCoup(0, 0, Pion.Couleur.NOIR);
            fail("Une exception devrait être lancée pour un coup invalide.");
        } catch (IllegalArgumentException e) {
            // Vérifie qu'une exception a bien été lancée
            assertEquals("Coup invalide.", e.getMessage(), "Le message de l'exception devrait être 'Coup invalide.'");
        }
    }

    /**
     * Teste la méthode afficherPlateau().
     * Vérifie si le plateau est bien affiché dans la console (peut être vérifié manuellement).
     */
    @Test
    void testAfficherPlateau() {
        Plateau plateau = new Plateau();
        
        // Affiche le plateau pour vérifier visuellement son contenu (manuellement observé)
        plateau.afficherPlateau();
        
        // Aucun assert ici, car l'affichage est destiné à être vérifié manuellement
    }
}
