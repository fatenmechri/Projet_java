// Définition de la classe Not pour représenter une note associée à une matière
public class Not {
    // Déclaration des variables membres
    private Matiere matiere; // Matière à laquelle la note est associée
    private float note; // Note de l'étudiant pour cette matière

    // Constructeur de la classe Not
    public Not(Matiere matieree, float note) {
        matiere = matieree; // Initialisation de la matière
        this.note = note; // Initialisation de la note de l'étudiant
    }

    // Méthode pour obtenir le nom de la matière associée à la note
    public String getNomMatiere() {
        return matiere.getNom(); // Renvoie le nom de la matière associée
    }

    // Méthode pour obtenir le coefficient de la matière associée à la note
    public float getCoefficient() {
        return matiere.getCofficient(); // Renvoie le coefficient de la matière associée
    }

    // Méthode pour obtenir la note de l'étudiant
    public float getNote() {
        return note; // Renvoie la note de l'étudiant
    }
    public float getCofficient(){
        return matiere.getCofficient();
    }
}
