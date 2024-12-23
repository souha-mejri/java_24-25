package tn.esprit.gestionemployes.entities;

import tn.esprit.gestionemployes.entities.Departement;

public interface IDepartement {
    void ajouterDepartement(Departement d);
    boolean rechercherDepartement(Departement d);
    void supprimerDepartement(Departement d);
    void afficherDepartements();
}
