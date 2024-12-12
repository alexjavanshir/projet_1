package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vol {
    private String numeroVol;
    private String depart;
    private String arrivee;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private Avion avion;
    private List<Passager> passagers;

    public Vol(String numeroVol, String depart, String arrivee) {
        this.numeroVol = numeroVol;
        this.depart = depart;
        this.arrivee = arrivee;
        this.passagers = new ArrayList<>();
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public String getDepart() {
        return depart;
    }

    public String getArrivee() {
        return arrivee;
    }

    public List<Passager> getPassagers() {
        return passagers;
    }

    public void setDateHeureDepart(String dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public void setDateHeureArrivee(String dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Avion getAvion() {
        return avion;
    }

    public void ajouterPassager(Passager passager) {
        passagers.add(passager);
    }

    public void obtenirVol() {
        System.out.println("\n[--------DETAIL-DU-VOL--------]");
        System.out.println("org.example.Vol " + numeroVol + " : " + depart + " -> " + arrivee);
        System.out.println("Départ : " + dateHeureDepart);
        System.out.println("Arrivée : " + dateHeureArrivee);
        System.out.println("État : " + etat);
        System.out.println("org.example.Avion : " + (avion != null ? avion.getModele() : "pas encore attribué"));
        System.out.println("[--------DETAIL-DU-VOL--------]\n");
    }

    public static Vol ajouterVol(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numéro du vol : ");
        String numeroVol = scanner.nextLine();
        System.out.print("Ville de départ : ");
        String villeDepart = scanner.nextLine();
        System.out.print("Ville d'arrivée : ");
        String villeArrivee = scanner.nextLine();
        return new Vol(numeroVol, villeDepart, villeArrivee);
    }
}
