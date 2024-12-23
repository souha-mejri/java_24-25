package tn.esprit.gestionemployes.entities;

import java.util.*;

import tn.esprit.gestionemployes.entities.*;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    // Constructeur
    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    // Instruction 2 : Ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d); // Si l'employé existe déjà, il sera remplacé
    }

    // Instruction 3 : Afficher tous les employés et départements
    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé : " + entry.getKey() + " => Département : " + entry.getValue());
        }
    }

    // Instruction 4 : Supprimer un employé
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    // Instruction 5 : Supprimer un employé et un département spécifiques
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        } else {
            System.out.println("La paire Employé-Département n'existe pas.");
        }
    }

    // Instruction 6 : Afficher les employés
    public void afficherEmployes() {
        Set<Employe> employes = affectations.keySet();
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // Instruction 7 : Afficher les départements
    public void afficherDepartements() {
        Collection<Departement> departements = affectations.values();
        for (Departement d : new HashSet<>(departements)) { // Éliminer les doublons
            System.out.println(d);
        }
    }

    // Instruction 8 : Rechercher un employé
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // Instruction 9 : Rechercher un département
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // Instruction 10 : Trier les employés par identifiant
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations); // Employe doit implémenter Comparable
    }
}
