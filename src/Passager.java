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
