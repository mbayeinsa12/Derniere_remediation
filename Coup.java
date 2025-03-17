public class Coup {
    private Joueur joueur;
    private Position positionCase;
    private Orientation orientation;
    
    public Coup(Joueur joueur, Position positionCase, Orientation orientation) {
        this.joueur = joueur;
        this.positionCase = positionCase;
        this.orientation = orientation;
    }
}
