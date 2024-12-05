public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;
    private Vol volAttribue; // Vol actuellement attribué à l'avion

    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
        this.volAttribue = null; // Aucun vol n'est attribué au départ
    }

    public void affecterVol(Vol vol) {
        if (volAttribue == null) { // Si aucun vol n'est attribué
            this.volAttribue = vol;
            System.out.println("L'avion " + immatriculation + " est affecté au vol " + vol.getNumeroVol() + ".");
        } else {
            System.out.println("L'avion " + immatriculation + " est déjà affecté au vol " + volAttribue.getNumeroVol() + ".");
        }
    }

    public boolean verifierDisponibilite() {
        return volAttribue == null; // Disponible si aucun vol n'est attribué
    }
}
