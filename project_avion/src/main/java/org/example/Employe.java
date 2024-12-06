package org.example;

public class Employe extends Personne {
    private int numeroEmploye;
    private String dateEmbauche;

    public Employe(String nom, String adresse, int contact, int numeroEmploye, String dateEmbauche) {
        super(nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public int getNumeroEmploye() {
        return numeroEmploye;
    }

    public void setNumeroEmploye(int numeroEmploye) {
        this.numeroEmploye = numeroEmploye;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    public String obtenirRole() {
        return String.format("Numéro de l'employé(e) : %d, Date d'embauche : %s",numeroEmploye,dateEmbauche);
    }
}
