public class PersonnelCabine extends Employe {
    private final String qualification;
    private Vol volAttribue;

    public PersonnelCabine(String nom, String adresse, int contact, int numeroEmploye, String dateEmbauche, String qualification) {
        super(nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
        this.volAttribue = null;
    }
    public String getQualification(){
        return qualification;
    }

    public void affecterVol(Vol vol) {
        if (volAttribue == null) {
            this.volAttribue = vol;
            System.out.println("Le personnel cabine " + super.getNom() + " (" + getQualification()+ ") est affecté au vol " + vol.getNumeroVol() + ".");
        } else {
            System.out.println("Le personnel cabine " + super.getNom() + " est déjà affecté au vol " + volAttribue.getNumeroVol() + ".");
        }
    }

    public Vol obtenirVol() {
        return volAttribue;
    }
}
