import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne {
    private String passeport;
    private final List<Reservation> reservations;

    public Passager(String nom, String adresse, int contact, String passeport) {
        super(nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    public String getPasseport() {
        return passeport;
    }

    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }

    public void reserverVol(Vol vol) {
        Reservation reservation = new Reservation(vol, this);
        reservations.add(reservation);
        System.out.println("Le passager " + getNom("") + " a réservé le vol " + vol.getNumeroVol() + ".");
    }

    public void annulerReservation(Reservation reservation) {
        if (reservations.contains(reservation)) {
            reservations.remove(reservation);
            reservation.annulerReservation();
            System.out.println("La réservation pour le vol " + reservation.getVol().getNumeroVol() + " a été annulée.");
        } else {
            System.out.println("Réservation non trouvée pour ce passager.");
        }
    }

    public List<Reservation> obtenirReservations() {
        return reservations;
    }
}
