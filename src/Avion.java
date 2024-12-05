public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public int getCapacite() {
        return capacite;
    }

    public void affecterVol(Vol vol) {
        System.out.println("L'avion " + immatriculation + " est affecté au vol " + vol.getNumeroVol() + ".");
    }

    public boolean verifierDisponibilite() {
        return true;
    }
}
