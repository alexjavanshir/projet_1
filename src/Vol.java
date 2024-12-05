import java.util.ArrayList;
import java.util.List;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private List<Reservation> reservations;

    public Vol(String numeroVol, String origine, String destination) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.reservations = new ArrayList<>();
    }

    public String getNumeroVol() {
        return numeroVol;
    }

    public String getOrigine() {
        return origine;
    }
    public void setOrigine(String origine){
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }

    public String getDateHeureDepart() {
        return dateHeureDepart;
    }

    public void setDateHeureDepart(String dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public String getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(String dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void affecterVol(Avion avion) {
        System.out.println("L'avion " + avion.getImmatriculation() + " est affecté au vol " + numeroVol);
    }

    public void planifierVol() {
        System.out.println("Le vol " + numeroVol + " a été planifié.");
    }

    public void annulerVol() {
        System.out.println("Le vol " + numeroVol + " a été annulé.");
    }

    public void obtenirVol() {
        System.out.println("Détails du vol : " + numeroVol + ", " + origine + " -> " + destination);
    }

    public void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
    }
}
