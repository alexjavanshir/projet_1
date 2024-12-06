import java.util.ArrayList;
import java.util.List;

public class Aeroport {
    private String nom;
    private String localisation;
    private List<Vol> vols;

    public Aeroport(String nom, String localisation) {
        this.nom = nom;
        this.localisation = localisation;
        this.vols = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void ajouterVol(Vol vol) {
        vols.add(vol);
    }

    public void afficherVols() {
        if (vols.isEmpty()) {
            System.out.println("\nAucun vol programmé pour l'aéroport " + nom + ".\n");
        } else {
            System.out.println("\nVols au départ de l'aéroport " + nom + " :");
            for (Vol vol : vols) {
                System.out.println(vol.getNumeroVol() + " : " + vol.getDepart() + " -> " + vol.getArrivee());
            }
            System.out.println();
        }
    }
}
