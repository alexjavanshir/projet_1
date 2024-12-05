import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passport;
    private List<Reservation> reservations;

    public Passager(String nom, String adresse, int contact, String passport) {
        super(nom, adresse, contact);
        this.passport = passport;
        this.reservations = new ArrayList<>();
    }

    public String getPassport() {
        return passport;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void reserverVol(Vol vol) {
        Reservation reservation = new Reservation(vol, this);
        reservations.add(reservation);
        System.out.println("Le passager " + getNom() + " a réservé le vol " + vol.getNumeroVol());
    }

    public void annulerReservation(int numeroReservation) {
        reservations.removeIf(reservation -> reservation.getNumeroReservation() == numeroReservation);
        System.out.println("La réservation #" + numeroReservation + " a été annulée.");
    }

    public void obtenirReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Aucune réservation.");
        } else {
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }
}
