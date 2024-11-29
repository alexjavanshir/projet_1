import java.util.Random;

public class Personne {
    private int identifiant;
    private String nom;
    private String adresse;
    private int contact;

    public Personne(String nom, String adresse, int contact) {
        this.identifiant = genererIdentifiant();
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public String obtenirInfos() {
        return String.format("ID : %d, Nom : %s, Adresse : %s, Contact : %d", identifiant, nom, adresse, contact);
    }

    public void setIdentifiant() {
        this.identifiant = genererIdentifiant();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }
    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom(String nom) {
        return nom;
    }

    public String getAdresse(String adresse) {
        return adresse;
    }

    public int getContact(int contact) {
        return contact;
    }

    private int genererIdentifiant() {
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }
}
