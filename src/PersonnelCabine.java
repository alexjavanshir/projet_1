public class PersonnelCabine extends Employe {
    private int qualification;
    private Vol volAttribue;

    public PersonnelCabine(String nom, String adresse, int contact, int numeroEmploye, String dateEmbauche, int qualification) {
        super(nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
        this.volAttribue = null;
    }

    public void affecterVol(Vol vol) {
        if (volAttribue == null) {
            this.volAttribue = vol;
            System.out.println("Le personnel cabine " + getNom("") + " est affecté au vol " + vol.getNumeroVol() + ".");
        } else {
            System.out.println("Le personnel cabine " + getNom("") + " est déjà affecté au vol " + volAttribue.getNumeroVol() + ".");
        }
    }

    public Vol obtenirVol() {
        return volAttribue;
    }
}
