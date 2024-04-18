// Exception personnalisée pour la matière non enseignée dans le département
public class MatiereNonEnseigneeExceptio extends Exception {
    public MatiereNonEnseigneeExceptio(String message) {
        super(message);
    }// Appel du constructeur de la classe Exception avec le message
}
