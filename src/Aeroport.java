public class Aeroport {
    private String name;
    private String ville;
    private String description;

    public Aeroport(String name, String ville, String description) {
        this.name = name;
        this.ville = ville;
        this.description = description;
    }

    public void affecterVol(Vol vol, boolean estDepart) {
        if (estDepart) {
            vol.setOrigine(this.name);
            System.out.println("L'aéroport " + name + " est défini comme point de départ pour le vol " + vol.getNumeroVol() + ".");
        } else {
            vol.setDestination(this.name);
            System.out.println("L'aéroport " + name + " est défini comme point d'arrivée pour le vol " + vol.getNumeroVol() + ".");
        }
    }
}
