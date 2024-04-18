import java.util.Set;
import java.util.Vector;
import java.util.HashSet;

public class Enseignant extends Personne {
    // Déclaration des variables
    private Departement departement;
    Vector<Matiere> listmatier=new Vector<>(); // Utilisation de Vector pour stocker les matières
    static Set<Departement> listdepartement= new HashSet<>();// Utilisation de set pour stocker les deprtemont


    // Constructeur de la classe Enseignant
    public Enseignant(int id, String nom, String prenom, Formation formation, Departement departemente)throws IdentifiantDejaUtiliseException  {

        super(id, nom, prenom,formation); // Appel du constructeur de la classe parente
        departement = departemente;// Initialisation du département
        listdepartement.add(departemente);

    }

    // Méthode pour ajouter une matière à la liste des matières de l'enseignant
    public void  ajouteuMatiere(Matiere matiere)throws MatiereDejaEnseigneeException {
        // Parcours de la liste des matières
        int r=0;
        for(Matiere m:listmatier){

            if(m.getNom()==matiere.getNom()){// Vérification si la matière existe déjà dans la liste (comparaison par le nom)
                r=1;
            }
        }
        if (r==1){
            throw new MatiereDejaEnseigneeException("la matière "+matiere.getNom()+" deja enseignée "); // exception matière existe déjà don listmatier
        }
        else {listmatier.add(matiere);// Ajout de la matière à la liste si elle n'existe pas déjà
             }
    }
    // Méthode pour obtenir le département de l'enseignant
    public Departement getDepartement() {
        return departement;// Renvoie le département de l'enseignant
    }

    public static Set<Departement> getListdepartement() {
        return listdepartement;
    }

    @Override
    public double calculerCoutFormation() {
        // Implémentation spécifique pour les enseignants avec une remise de 50%
        double re=0;
        re=(this.getFormation().getCout()*50)/100;
        double cou=0;
        cou=this.getFormation().getCout()-re;
        return cou;
    }
}
