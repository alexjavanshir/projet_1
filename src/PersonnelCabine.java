public class PersonnelCabine extends Employe{
    private int qualificaton;
    public PersonnelCabine(String nom, String adresse, int contact, int numeroEmploye, String dateEmbauche, int qualificaton) {
        super(nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualificaton = qualificaton;
    }

    public void setQualificaton(int qualificaton) {
        this.qualificaton = qualificaton;
    }
    public int getQualificaton() {
        return qualificaton;
    }
    public void affecterVol(){
        //--------------------------------------------------------//
    }
    public void obtenirVol(){
        //--------------------------------------------------------//
    }
}
