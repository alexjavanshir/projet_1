public class Main {
    public static void main(String[] args) {
        Vol vol1 = new Vol();
        vol1.setNumeroVol("AF123");
        vol1.setOrigine("Paris");
        vol1.setDestination("New York");

        Passager passager1 = new Passager("Alice Dupont", "10 rue de Paris", 123456789, "FR12345678");

        passager1.reserverVol(vol1);

        for (Reservation res : passager1.obtenirReservations()) {
            System.out.println("Réservation : " + res.getNumeroReservation() + ", Vol : " + res.getVol().getNumeroVol());
        }

        Reservation reservation = passager1.obtenirReservations().get(0);
        passager1.annulerReservation(reservation);
    }
}
