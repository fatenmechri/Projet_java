// Exception personnalisée pour l'identifiant déjà utilisé
public class IdentifiantDejaUtiliseException extends Exception {
   public   IdentifiantDejaUtiliseException(String message) {
        super(message);
    }
}
