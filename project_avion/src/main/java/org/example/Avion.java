package org.example;

import java.util.Scanner;

public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public int getCapacite() {
        return capacite;
    }

    public void affecterVol(Vol vol) {
        System.out.println("org.example.Avion " + immatriculation + " affecté au vol " + vol.getNumeroVol());
    }

    public void obtenirInfos() {
        System.out.println("\n[--------INFO-DE-L-AVION--------]");
        System.out.println("Immatriculation " + immatriculation);
        System.out.println("Modèle : " + modele);
        System.out.println("Capacité : " + capacite);
        System.out.println("[--------INFO-DE-L-AVION--------]\n");
    }

    public static Avion ajouterAvion(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Immatriculation de l'avion : ");
        String immatriculationAvion = scanner.nextLine();
        System.out.print("Modèle de l'avion : ");
        String modeleAvion = scanner.nextLine();
        System.out.print("Capacité de l'avion : ");
        int capaciteAvion = scanner.nextInt();
        scanner.nextLine();
        return new Avion(immatriculationAvion, modeleAvion, capaciteAvion);

    }
}
