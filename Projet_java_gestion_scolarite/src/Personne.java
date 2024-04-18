import java.util.Set;
import java.util.Vector;
import java.util.HashSet;

// Définition de la classe Personne
abstract class Personne {// Déclaration des variables
    private int id;
    private String nom;
    private String prenom;
    private Formation formation;
  private static Set<Integer> listid = new HashSet<>();// Utilisation de set pour stocker les id de personnepour


    // Constructeur de la classe Personne

    public Personne( int id,String nom, String prenom,Formation formation)  throws IdentifiantDejaUtiliseException{

        if(listid.contains(id)){
            throw new IdentifiantDejaUtiliseException("Cet identifiant:"+id+" est déjà utilisé.");
        }
        else {this.id = id;// Initialisation de l'identifiant
            this.nom = nom;// Initialisation du nom
            this.prenom = prenom; // Initialisation du prénom
            listid.add(id);//ajoute id  de personne sur listid
            this.formation=formation;
            listid.add(id);
        }
    }
    // Méthode pour obtenir l'identifiant de la personne
    public int getId() {
        return id;
    }
    // Méthode pour obtenir le nom de la personne
    public String getNom() {
        return nom;
    }
    // Méthode pour obtenir le prénom de la personne
    public String getPrenom() {
        return prenom;
    }
    public Formation getFormation(){
        return formation;
    }



    public abstract double calculerCoutFormation() ;
        // Implémentation spécifique pour les étudiants avec une remise de 70%





}

