public class Pilote extends Employe {
    private int license;
    private int heureDeVol;

    public Pilote(String nom, String adresse, int contact, int numeroEmploye, String dateEmbauche, int license, int heureDeVol) {
        super(nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.license = license;
        this.heureDeVol = heureDeVol;
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    public int getHeureDeVol() {
        return heureDeVol;
    }

    public void setHeureDeVol(int heureDeVol) {
        this.heureDeVol = heureDeVol;
    }

    public void affecterVol(){
        //--------------------------------------------------------//
    }
    public void obtenirVol(){
        //--------------------------------------------------------//
    }
}

