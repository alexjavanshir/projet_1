package org.example;

import java.util.Scanner;

public class PersonnelCabine {
    private String nom;
    private String adresse;
    private int telephone;
    private int idEmploye;
    private String dateEmbauche;
    private String niveauExperience;

    public PersonnelCabine(String nom, String adresse, int telephone, int idEmploye, String dateEmbauche, String niveauExperience) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.idEmploye = idEmploye;
        this.dateEmbauche = dateEmbauche;
        this.niveauExperience = niveauExperience;
    }

    public String getNom() {
        return nom;
    }

    public void affecterVol(Vol vol) {
        System.out.println("Personnel de cabine " + nom + " affecté au vol " + vol.getNumeroVol());
    }

    public void obtenirInfos() {
        System.out.println("\n[--------INFO-PERSONNEL--------]");
        System.out.println("Nom : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Téléphone : " + telephone);
        System.out.println("ID Employé : " + idEmploye);
        System.out.println("Date d'embauche : " + dateEmbauche);
        System.out.println("Niveau d'expérience : " + niveauExperience);
        System.out.println("[--------INFO-PERSONNEL--------]\n");
    }

    public static PersonnelCabine ajouterPersonnelCabine(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nom du personnel cabine : ");
        String nomPersonnel = scanner.nextLine();
        System.out.print("Adresse du personnel cabine : ");
        String adressePersonnel = scanner.nextLine();
        System.out.print("Numéro de téléphone : ");
        int telephonePersonnel = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Numéro d'identification du personnel cabine : ");
        int idPersonnel = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Date d'embauche (YYYY-MM-DD) : ");
        String dateEmbauchePersonnel = scanner.nextLine();
        System.out.print("Niveau de certification (ex : Novice, Intermédiaire, Expert) : ");
        String niveauCertification = scanner.nextLine();
        return new PersonnelCabine(nomPersonnel, adressePersonnel, telephonePersonnel, idPersonnel, dateEmbauchePersonnel, niveauCertification);
    }
}
