import java.util.Collections;
import java.util.Set;
import java.util.Vector;
import java.util.HashSet;
// Définition de la classe "Departement"
public class Departement {
    private String nom;// Déclaration de la variable "nom" de type String
    Vector<Enseignant> listEnsignant = new Vector<>(); // Déclaration de la liste des enseignants
    Vector<Etudiant> listEtudiant = new Vector<>(); // Déclaration de la liste des étudiants
    // Constructeur de la classe "Departement"



    public Departement(String nom) {
        this.nom = nom; // Initialisation de la variable "nom" avec la valeur passée en paramètre

    }
    // Méthode pour ajouter un enseignant à la liste des enseignants du département
    public void ajouteuEensegnant(Enseignant enseignant) throws EnseignantDejaDansUnAutreDepartementException{
        int res;
        res=0;
        for (Departement d:enseignant.getListdepartement()){
           for(Enseignant en:d.listEnsignant){
               if(en==enseignant){
                   res=1;
               }
           }
        }
        if (res==1){
            throw new EnseignantDejaDansUnAutreDepartementException("Enseignant:"+enseignant.getNom()+" Deja Dans Un Autre Departement");
        }

        else {
            for (Enseignant e : listEnsignant) { // Parcourir la liste des enseignants
                if (e.getId() == enseignant.getId()) { // Vérifier si l'enseignant existe déjà dans la liste
                    return;// Sortir de la méthode si l'enseignant existe déjà
                }

            }
            listEnsignant.add(enseignant);// Ajouter l'enseignant à la liste s'il n'existe pas déjà
        }
    }
    // Méthode pour rechercher un enseignant dans la liste des enseignants du département
    public String rechercheEnseignant(Enseignant enseignant) {
        for (Enseignant e : listEnsignant) {// Parcourir la liste des enseignants
            if (e.getId() == enseignant.getId()) {// Vérifier si l'enseignant existe dans la liste
                return (" enseignant " + enseignant.getNom()+ " est donne la liste");// Retourner un message indiquant que l'enseignant est dans la liste
            }
        }
        return (" enseignant " + enseignant + "est ne pas donne la liste");// Retourner un message indiquant que l'enseignant n'est pas dans la liste

    }
    public String rechercherEnseignantParMatiere(Matiere matiere)throws MatiereNonEnseigneeExceptio{
        String nomdeensignantdondepartemont=new String();
        nomdeensignantdondepartemont="les Enseignant don cest matier est :";
        for(Enseignant e:listEnsignant){
            for(Matiere m :e.listmatier){
                if(m==matiere){
                    nomdeensignantdondepartemont=nomdeensignantdondepartemont+e.getNom()+" "+e.getPrenom()+",";

                }
            }
        }
        if(nomdeensignantdondepartemont=="les Enseignant don cest matier est :"){
            throw new MatiereNonEnseigneeExceptio("la matière: "+matiere.getNom() +"n'est pas enseignée dans le département,");
        }
        else{ return (nomdeensignantdondepartemont);}
    }
    // Méthode pour rechercher un étudiant dans la liste des étudiants du département
    public String rechercheEtudiant(Etudiant etudiant) { // Parcourir la liste des enseignants
        for (Etudiant e : listEtudiant) { // Parcourir la liste des étudiants
            if (e. getId() == etudiant. getId()) {// Vérifier si l'étudiant existe dans la liste
                return ("le etudiant " + etudiant.getId() + "est donne la liste"); // Retourner un message indiquant que l'étudiant est dans la liste
            }
        }
        return ("le etudiant " + etudiant + "est ne pas donne la liste");// Retourner un message indiquant que l'étudiant n'est pas dans la liste


    }

}