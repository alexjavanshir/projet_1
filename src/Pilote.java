public class Pilote {
    private String nom;
    private String adresse;
    private int telephone;
    private int idEmploye;
    private String dateEmbauche;
    private int numLicence;
    private int heuresVol;

    public Pilote(String nom, String adresse, int telephone, int idEmploye, String dateEmbauche, int numLicence, int heuresVol) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.idEmploye = idEmploye;
        this.dateEmbauche = dateEmbauche;
        this.numLicence = numLicence;
        this.heuresVol = heuresVol;
    }

    public String getNom() {
        return nom;
    }

    public void affecterVol(Vol vol) {
        System.out.println("Pilote " + nom + " affecté au vol " + vol.getNumeroVol());
    }
    public void obtenirInfos() {
        System.out.println("\n[--------INFO-PERSONNEL--------]");
        System.out.println("Nom : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Téléphone : " + telephone);
        System.out.println("ID Employé : " + idEmploye);
        System.out.println("Date d'embauche : " + dateEmbauche);
        System.out.println("Heures de vol : " + heuresVol);
        System.out.println("[--------INFO-PERSONNEL--------]\n");
    }
}
