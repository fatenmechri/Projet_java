import java.util.Collections;
import java.util.Vector;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.Parameter;
import java.util.jar.JarOutputStream;



public class Main {
    public static void main(String[] args) throws MoyenneHorsPlageException {
        System.out.println("Hello world!");
        Departement eea = new Departement("eea");// Création d'un département
        Departement chimi = new Departement("chimi");// Création d'un département

        float v = 15.2E00F;
        float b = 11.0E01f;
        // Créer une instance de formation
        Formation formation = new Formation("java", 30, 50.55);
        Formation formation1 = new Formation("python", 30, 70.55);
        // Création d'une instance d'étudiant
        Etudiant faten = null;
        try {
            faten = new Etudiant(1, "faten", "mechri", 1_154_892, eea,formation);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Création des instances d'enseignant
        Enseignant e1 = null;
        try {
            e1 = new Enseignant(11, "linda", "chi",formation, eea);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Enseignant e2 = null;
        try {
            e2 = new Enseignant(2, "chahin", "klbi",formation, eea);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Enseignant e3 = null;
        try {
            e3 = new Enseignant(3, "mohmed", "ajmi",formation, eea);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Création des matiere
        Matiere math= null;
        Matiere web= null;
        try {
            math = new Matiere("math",2);
            //web= new Matiere("web",-2); //CoefficientHorsPlageException
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Matiere ph= null;
        try {
            ph = new Matiere("ph",2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Matiere java= null;
        try {
            java = new Matiere("java",3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Matiere info= null;
        try {
            info = new Matiere("info",5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Création des notes pour l'étudiant
        Not a = new Not(math, 15.2E00F);
        Not h = new Not(ph, 17.2E00F);
        Not c = new Not(info, 19.2E00F);
        Not d = new Not(java, 10.2E00F);
        //Not d = new Not(java, -10.2E00F);//MoyenneHorsPlageException
        // Ajout des notes à l'étudiant
        try {
            faten.ajouterNote(c);
            faten.ajouterNote(a);
            faten.ajouterNote(h);
            faten.ajouterNote(d);//MoyenneHorsPlageException
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // Affichage des notes de l'étudiant
        System.out.println(faten.listnot);
        System.out.println(faten.getNom());
        faten.affichrlistnot();
        // Calcul et affichage de la moyenne de l'étudian
        faten.afficherMoyenne();
        // Ajout des enseignants au département
        try {
            eea.ajouteuEensegnant(e1);
            eea.ajouteuEensegnant(e2);
            eea.ajouteuEensegnant(e3);

            //chimi.ajouteuEensegnant(e1);// EnseignantDejaDansUnAutreDepartementException

        }catch (Exception e){
            throw new RuntimeException(e);
        }
        eea.rechercheEnseignant(e3);

        // Recherche d'un enseignant dans le département et affichage du résultat
        System.out.println(eea.rechercheEnseignant(e3));
        // Créer une instance de formation
        Formation formation3 = new Formation("c", 30, 90.55);

        // Créer des instances  d'enseignants

        Enseignant ens1 = null;
        try {
            ens1 = new Enseignant(22, "Smith", "hanno", formation, eea);//IdentifiantDejaUtiliseException
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            Enseignant ens2 = new Enseignant(23, "Smith", "hanno", formation, eea);
            //Enseignant ens2 = new Enseignant(22, "ahmed", "rjeb", formation, eea); //IdentifiantDejaUtiliseException
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Etudiant fatma = null;
        try {
            fatma = new Etudiant(29, "fatma", "medin", 6_958_782, eea, formation);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }




        // Afficher le coût de chaque individu

        System.out.println("Coût de la formation pour l'étudiant : " + fatma.calculerCoutFormation());
        System.out.println("Coût de la formation pour l'enseignant : " + ens1.calculerCoutFormation());
        Interface1 fat=new Interface1();
        
        try {
            e1. ajouteuMatiere(math);
            //e1. ajouteuMatiere(math);// MatiereDejaEnseigneeException
            e2. ajouteuMatiere(math);
        }catch (Exception e){
            throw new RuntimeException(e);

        }

      try {
          System.out.println(eea.rechercherEnseignantParMatiere(math));
      }catch (Exception e) {
          throw new RuntimeException(e);
      }
        try {
           //System.out.println(eea.rechercherEnseignantParMatiere(info));//MatiereNonEnseigneeExceptio
        }catch (Exception e) {
            throw new RuntimeException(e);
        }


    }





}