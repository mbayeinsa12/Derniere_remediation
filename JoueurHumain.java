public class JoueurHumain extends Joueur {
    
    public JoueurHumain(String nom) {
        this.nom = nom;
        this.score = 0;
    }
    
    @Override
    public Position choisirCase(Grille grille) {
        // Méthode qui permet à l'humain de choisir une case via un prompt ou une interface.
        return null;
    }
}
