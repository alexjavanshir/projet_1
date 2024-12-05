import java.util.ArrayList;
import java.util.List;

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

    public String getNom() {
        return nom;
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
            System.out.println("Aucune réservation.");
        } else {
            reservations.forEach(System.out::println);
        }
    }
}
