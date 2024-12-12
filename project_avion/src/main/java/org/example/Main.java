package org.example;

public class Main {
    public static void main(String[] args) {
        Passager passager1 = new Passager("Esteban Boulet", "13 Rue de Montreuil", 622457159, "A1234567");
        Passager passager2 = new Passager("Jeanne Dupont", "25 Boulevard Raspail", 656102398, "B7654321");

        Vol vol1 = new Vol("AFPNY", "Paris", "New York");

        Avion avion1 = new Avion("F-WOEH", "Airbus A320", 180);
        avion1.affecterVol(vol1);

        passager1.reserverVol(vol1);
        passager2.reserverVol(vol1);

        System.out.println("Passager 1: " + passager1);
        System.out.println("Passager 2: " + passager2);
        System.out.println("Vol 1: " + vol1);
        System.out.println("Avion affecté: " + avion1);
    }
}
