// Exception personnalisée pour l'enseignant déjà dans un autre département
public class EnseignantDejaDansUnAutreDepartementException extends Exception {
    public EnseignantDejaDansUnAutreDepartementException(String message) {
        super(message);

    }
}
