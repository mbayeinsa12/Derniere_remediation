public class TestPartie {
    public static void main(String[] args) {
        Grille grille = new Grille(5);
        JoueurHumain joueur1 = new JoueurHumain("Joueur 1");
        JoueurOrdinateur joueur2 = new JoueurOrdinateur("Ordinateur");
        
        Partie partie = new Partie(joueur1, joueur2, grille);
        
        // Logique de test : jeu entre les deux joueurs, affichage des scores et de la grille.
    }
}

