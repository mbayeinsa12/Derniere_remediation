public class Grille {
    private Case[][] cases;
    private int taille;

    public Grille(int taille) {
        this.taille = taille;
        this.cases = new Case[taille][taille];
        // Initialisation de la grille avec des valeurs.
    }

    public Case getCase(Position position) {
        return cases[position.getX()][position.getY()];
    }

    public AlignementCases getAlignement(Position position, Orientation orientation) {
        
        // Retourner une ligne ou une colonne selon l'orientation.
        return null;
    }
    
}
