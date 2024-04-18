// Exception personnalisée pour le coefficient hors de la plage autorisée
public class CoefficientHorsPlageException extends Exception {
    public CoefficientHorsPlageException(String message) {
        super(message);
    }
}
