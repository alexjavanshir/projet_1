public class Aeroport {
    private String name;
    private String ville;
    private String description;

    public Aeroport(String name, String ville, String description){
        this.name = name;
        this.ville = ville;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
