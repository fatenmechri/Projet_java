// Définition de la classe Matiere
public class Matiere { // Déclaration des variables
    private String nom;
    private float cofficient;
    // Constructeur de la classe Matiere
    public Matiere(String nom,float cofficient)throws CoefficientHorsPlageException {
        this.nom = nom;// Initialisation du nom de la matière
        if(cofficient<0){
            throw new CoefficientHorsPlageException("le cofficient:"+cofficient+" de un matier pe etre 0<");}
        else {
            this.cofficient = cofficient; // Initialisation du coefficient de la matière
        }

    }
    // Méthode pour obtenir le nom de la matière
    public String getNom() {return nom;}
    // Méthode pour obtenir le coefficient de la matière
    public float getCofficient() {
        return cofficient;
    }


}

