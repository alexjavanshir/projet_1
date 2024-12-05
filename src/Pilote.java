public class Pilote extends Employe {
    private int license;
    private int heureDeVol;
    private Vol volAttribue;

    public Pilote(String nom, String adresse, int contact, int numeroEmploye, String dateEmbauche, int license, int heureDeVol) {
        super(nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.license = license;
        this.heureDeVol = heureDeVol;
        this.volAttribue = null;
    }

    public void affecterVol(Vol vol) {
        if (volAttribue == null) {
            this.volAttribue = vol;
            System.out.println("Le pilote " + super.getNom() + " est affecté au vol " + vol.getNumeroVol() + ".");
        } else {
            System.out.println("Le pilote " + super.getNom() + " est déjà affecté au vol " + volAttribue.getNumeroVol() + ".");
        }
    }

    public Vol obtenirVol() {
        return volAttribue;
    }
}
