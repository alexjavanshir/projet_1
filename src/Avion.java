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

    public void affecterVol(Vol vol) {
        System.out.println("Avion " + immatriculation + " affecté au vol " + vol.getNumeroVol());
    }

    public void obtenirInfos() {
        System.out.println("\n[--------INFO-DE-L-AVION--------]");
        System.out.println("Immatriculation " + immatriculation);
        System.out.println("Modèle : " + modele);
        System.out.println("Capacité : " + capacite);
        System.out.println("[--------INFO-DE-L-AVION--------]\n");
    }
}
