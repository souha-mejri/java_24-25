package tn.esprit.gestionemployes.entities;

import java.util.Objects;

public class Departement {
    private int id;
    private String nomDepartement;
    private int nbrEmployes;

    // Constructeur sans paramètres
    public Departement() {}

    // Constructeur avec paramètres
    public Departement(int id, String nomDepartement, int nbrEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbrEmployes = nbrEmployes;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNbrEmployes() {
        return nbrEmployes;
    }

    public void setNbrEmployes(int nbrEmployes) {
        this.nbrEmployes = nbrEmployes;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Departement)) return false;
        Departement other = (Departement) obj;
        return this.id == other.id && this.nomDepartement.equals(other.nomDepartement);
    }

    // Redéfinition de la méthode hashCode (nécessaire avec HashSet)
    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement);
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Departement{id=" + id + ", nomDepartement='" + nomDepartement + "', nbrEmployes=" + nbrEmployes + "}";
    }
}
