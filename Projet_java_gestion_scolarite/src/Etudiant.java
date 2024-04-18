import java.util.Set;
import java.util.Vector;
import java.util.HashSet;


// Définition de la classe Etudiant

public class Etudiant extends Personne { // Déclaration des variables membres
    private int matricule;
    private Departement departement;
   Vector<Not> listnot;// Utilisation de Vector pour stocker les notes

    // Constructeur de la classe Etudiant

    public Etudiant(int id, String nom, String prenom, int matricule, Departement departement,Formation formatione)throws IdentifiantDejaUtiliseException{
        super(id, nom, prenom,formatione);// Appel du constructeur de la classe parente
        this.matricule = matricule;// Initialisation du matricule
        this.departement = departement;// Initialisation du département


        listnot = new Vector<>();
    }
    // Méthode pour ajouter une note à la liste des notes de l'étudiant
    public void ajouterNote(Not c) throws MoyenneHorsPlageException { // Vérification si la note est valide (dans l'intervalle [0, 20])
        if (c.getNote()  < 0 || c.getNote()  > 20) {
            throw new MoyenneHorsPlageException("les not n'est valide pur etre dons l'intrvalle[0,20]:" +c. getNote() );
        }
        else {
            listnot.add(c);// Ajout de la note à la liste
        }
    }
    // Méthode pour calculer la moyenne des notes de l'étudiant
    public float calculerMoyenne() {
        float c = 0;// Somme des notes multipliées par les coefficients
        float d=0; //somme des coefficients
        for (Not i :listnot) { // Parcours de la liste des not
            c+=i.getNote()*i.getCofficient() ;// Calcul de la somme des notes pondérées
            d+=i.getCofficient(); // Calcul de la somme des coefficients
        }
        return (c/d); // Calcul et renvoi de la moyenne
    }
    // Méthode pour afficher la moyenne de l'étudiant
    public void afficherMoyenne() {
        System.out.println("le moyenne:"+calculerMoyenne());
    }
    // Méthode pour obtenir le département de l'étudiant
    public Departement getDepartement() {
        return departement; // Renvoie le département de l'étudiant
    }
    // Méthode pour afficher la liste des notes de l'étudiant
    public void affichrlistnot(){
        for(Not n:listnot){ // Parcours de la liste des not

            System.out.println("nom: "+n.getNomMatiere()+"  cofficient:"+n.getCofficient()+"  not:"+n.getNote());
        }
    }
    @Override
    public double calculerCoutFormation() {
        // Implémentation spécifique pour les enseignants avec une remise de 50%
        double re=0;
        re=(this.getFormation().getCout()*70)/100;
        double cou=0;
        cou=this.getFormation().getCout()-re;
        return cou;
    }



}