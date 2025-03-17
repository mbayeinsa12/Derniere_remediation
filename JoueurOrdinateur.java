public class JoueurOrdinateur extends Joueur {
    
    public JoueurOrdinateur(String nom) {
        this.nom = nom;
        this.score = 0;
    }

    @Override
    public Position choisirCase(Grille grille) {
        // Implémentation des différentes stratégies de l'ordinateur (1 à 4).
        // Par exemple, choisir la case avec la valeur maximale.
        return  null;
    }
}
