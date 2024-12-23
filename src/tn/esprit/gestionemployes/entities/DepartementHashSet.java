package tn.esprit.gestionemployes.entities;

import tn.esprit.gestionemployes.entities.IDepartement;

import java.util.HashSet;
import java.util.Set;

public class DepartementHashSet implements IDepartement {
    private Set<Departement> departements;

    // Constructeur
    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement d) {
        if (departements.add(d)) {
            System.out.println("Département ajouté avec succès.");
        } else {
            System.out.println("Département déjà existant.");
        }
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        if (departements.remove(d)) {
            System.out.println("Département supprimé avec succès.");
        } else {
            System.out.println("Département introuvable.");
        }
    }

    @Override
    public void afficherDepartements() {
        if (departements.isEmpty()) {
            System.out.println("Aucun département n'est disponible.");
        } else {
            departements.forEach(System.out::println);
        }
    }
}
