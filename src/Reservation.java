public class Reservation {
    private final String numeroReservation;
    private final String dateReservation;
    private String statut;
    private Vol vol;
    private final Passager passager;

    public Reservation(Vol vol, Passager passager) {
        this.numeroReservation = genererNumeroReservation();
        this.dateReservation = java.time.LocalDate.now().toString(); // Date actuelle
        this.statut = "Confirmée";
        this.vol = vol;
        this.passager = passager;
    }

    private String genererNumeroReservation() {
        return "RES" + (int) (Math.random() * 10000);
    }

    public String getNumeroReservation() {
        return numeroReservation;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Vol getVol() {
        return vol;
    }

    public Passager getPassager() {
        return passager;
    }

    public void confirmerReservation() {
        this.statut = "Confirmée";
    }

    public void annulerReservation() {
        this.statut = "Annulée";
    }

    public void modifierReservation(Vol nouveauVol) {
        this.vol = nouveauVol;
        System.out.println("La réservation a été mise à jour avec le vol " + nouveauVol.getNumeroVol() + ".");
    }
}
