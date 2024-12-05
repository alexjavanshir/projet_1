public class Avion {
    private final String immatriculation;
    private final String modele;
    private final int capacite;

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
