package org.example;

public class Reservation {
    private static int counter = 1;
    private int id;
    private Passager passager;
    private Vol vol;

    public Reservation(Passager passager, Vol vol) {
        this.id = counter++;
        this.passager = passager;
        this.vol = vol;
    }

    public int getId() {
        return id;
    }

    public Vol getVol() {
        return vol;
    }

    @Override
    public String toString() {
        return "\nRéservation #" + id + " : org.example.Vol " + vol.getNumeroVol() + " (" + vol.getDepart() + " -> " + vol.getArrivee() + ")\n";
    }
}
