package PAdherents;

public class Coordonnees {
    private String numeroDeTelephone;
    private String email;

    public Coordonnees(String numeroDeTelephone, String email) {
        this.numeroDeTelephone = numeroDeTelephone;
        this.email = email;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
