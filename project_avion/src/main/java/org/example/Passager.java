package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Passager {
    private String nom;
    private String adresse;
    private int telephone;
    private String passeport;
    private List<Reservation> reservations;

    public Passager(String nom, String adresse, int telephone, String passeport) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    public static Passager ajouterPassager() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nom du passager : ");
        String nomPassager = scanner.nextLine();
        System.out.print("Adresse du passager : ");
        String adressePassager = scanner.nextLine();
        System.out.print("Numéro de téléphone : ");
        int telephonePassager = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Numéro de passeport : ");
        String passeportPassager = scanner.nextLine();
        return new Passager(nomPassager, adressePassager, telephonePassager, passeportPassager);
    }
    public static Passager supprimerPassager() {
        return null;
    }

    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getTelephone() {
        return adresse;
    }

    public String getPasseport() {
        return passeport;
    }
    public List<Reservation> getReservation(){
        return reservations;
    }

    public void reserverVol(Vol vol) {
        reservations.add(new Reservation(this, vol));
    }

    public void annulerReservation(int id) {
        reservations.removeIf(reservation -> reservation.getId() == id);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void obtenirReservations() {
        if (reservations.isEmpty()) {
            System.out.println("\nAucune réservation.\n");
        } else {
            reservations.forEach(System.out::println);
        }
    }

    public void obtenirInfos() {
        System.out.println("\n[--------INFOS-PASSAGER--------]");
        System.out.println("Détails du passager :");
        System.out.println("Nom : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Téléphone : " + telephone);
        System.out.println("Passeport : " + passeport);
        System.out.println("[--------INFOS-PASSAGER--------]\n");
    }
}
