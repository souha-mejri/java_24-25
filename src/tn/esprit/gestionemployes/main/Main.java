package tn.esprit.gestionemployes.main;

import tn.esprit.gestionemployes.entities.SocieteArrayList;
import tn.esprit.gestionemployes.entities.Employe;
import tn.esprit.gestionemployes.entities.Departement;
import tn.esprit.gestionemployes.entities.DepartementHashSet;
import tn.esprit.gestionemployes.entities.AffectationHashMap;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();
        DepartementHashSet gestionDepartements = new DepartementHashSet();
        AffectationHashMap gestionAffectation = new AffectationHashMap();

        // Création de quelques employés
        Employe employe1 = new Employe(1, "Ben Ali", "Ahmed", "Informatique", 3);
        Employe employe2 = new Employe(2, "Benzarti", "Leila", "Ressources Humaines", 2);
        Employe employe3 = new Employe(3, "Salah", "Mohamed", "Informatique", 4);

        // Ajout des employés
        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe3);

        // Affichage des employés
        System.out.println("Liste des employés : ");
        societe.displayEmploye();

        // Recherche par nom
        System.out.println("\nRecherche de l'employé Ben Ali : " + societe.rechercherEmploye("Ben Ali"));
        System.out.println("Recherche de l'employé Mohamed : " + societe.rechercherEmploye("Mohamed"));

        // Tri par ID
        System.out.println("\nTri des employés par ID : ");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Tri par nom, département et grade
        System.out.println("\nTri des employés par nom, département et grade : ");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        // Suppression d'un employé
        System.out.println("\nSuppression de l'employé Leila Benzarti : ");
        societe.supprimerEmploye(employe2);
        societe.displayEmploye();

        // Création de départements
        Departement dep1 = new Departement(1, "Informatique", 10);
        Departement dep2 = new Departement(2, "RH", 5);
        Departement dep3 = new Departement(3, "Finance", 8);

        // Ajout de départements
        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);

        // Affichage des départements
        gestionDepartements.afficherDepartements();

        // Recherche d'un département
        System.out.println("Recherche du département RH : " +
                gestionDepartements.rechercherDepartement(new Departement(2, "RH", 0)));

        // Suppression d'un département
        gestionDepartements.supprimerDepartement(dep2);

        // Affichage après suppression
        gestionDepartements.afficherDepartements();

        // Gestion des affectations
        System.out.println("\n--- Gestion des Affectations ---");

        // Affectation des employés aux départements
        gestionAffectation.ajouterEmployeDepartement(employe1, dep1);
        gestionAffectation.ajouterEmployeDepartement(employe2, dep3);
        gestionAffectation.ajouterEmployeDepartement(employe3, dep1);

        // Affichage des employés et leurs départements
        System.out.println("\nAffectations des employés aux départements :");
        gestionAffectation.afficherEmployesEtDepartements();

        // Tentative d'ajout d'un employé dans un autre département
        System.out.println("\nAjout du même employé dans un autre département :");
        gestionAffectation.ajouterEmployeDepartement(employe1, dep3);
        gestionAffectation.afficherEmployesEtDepartements();

        // Recherche d'un employé
        System.out.println("\nRecherche de l'employé Ahmed Ben Ali : " +
                gestionAffectation.rechercherEmploye(employe1));

        // Recherche d'un département
        System.out.println("Recherche du département Informatique : " +
                gestionAffectation.rechercherDepartement(dep1));

        // Suppression d'un employé
        System.out.println("\nSuppression de l'employé Salah Mohamed :");
        gestionAffectation.supprimerEmploye(employe3);
        gestionAffectation.afficherEmployesEtDepartements();

        // Suppression d'une affectation employé-département
        System.out.println("\nSuppression de l'affectation Ahmed Ben Ali au département Informatique :");
        gestionAffectation.supprimerEmployeEtDepartement(employe1, dep1);
        gestionAffectation.afficherEmployesEtDepartements();

        // Affichage des employés
        System.out.println("\nListe des employés :");
        gestionAffectation.afficherEmployes();

        // Affichage des départements
        System.out.println("\nListe des départements :");
        gestionAffectation.afficherDepartements();

        // Tri des employés selon leur ID
        System.out.println("\nTri des employés par ID :");
        System.out.println(gestionAffectation.trierMap());
    }
}
