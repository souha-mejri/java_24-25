package tn.esprit.gestionemployes.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> listeEmployes;

    // Constructeur
    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }

    // Ajouter un employé
    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    // Rechercher un employé par nom
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    // Rechercher un employé en fonction de l'objet Employe
    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    // Supprimer un employé
    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    // Afficher la liste des employés
    @Override
    public void displayEmploye() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe);
        }
    }

    // Trier les employés par ID (Comparable)
    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes, (e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
    }

    // Trier les employés par Nom, Département et Grade (Comparator)
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int nomComparison = e1.getNom().compareTo(e2.getNom());
                if (nomComparison != 0) {
                    return nomComparison;
                }
                int departementComparison = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (departementComparison != 0) {
                    return departementComparison;
                }
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }
}
