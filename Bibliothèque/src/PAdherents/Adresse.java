package PAdherents;

public class Adresse {
    private String codePostal;
    private String rue;
    private String ville;

    public Adresse(String codePostal, String rue, String ville) {
        this.codePostal = codePostal;
        this.rue = rue;
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
