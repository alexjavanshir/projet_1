import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private static int compteurReservation = 1;
    private final int numeroReservation;
    private final Vol vol;
    private final Passager passager;
    private final String dateReservation;
    private String statut;

    public Reservation(Vol vol, Passager passager) {
        this.numeroReservation = compteurReservation++;
        this.vol = vol;
        this.passager = passager;
        this.dateReservation = java.time.LocalDate.now().toString();
        this.statut = "Confirmée";
    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public Vol getVol() {
        return vol;
    }

    public Passager getPassager() {
        return passager;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return String.format("Réservation #%d : Vol %s, Passager %s, Date : %s, Statut : %s",
                numeroReservation, vol.getNumeroVol(), passager.getNom(), dateReservation, statut);
    }
}
