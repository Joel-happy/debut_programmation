package PApplication;
import PLivres.*;
import PAdherents.*;
import java.util.Date;

public class ReservationLivres {
    private Adherent adherent;
    private Livre livre;
    private Date dateReservation;

    public ReservationLivres(Adherent adherent, Livre livre) {
        this.adherent = adherent;
        this.livre = livre;
        this.dateReservation = new Date();
    }

    public Adherent getAdherent() {
        return adherent;
    }

    public Livre getLivre() {
        return livre;
    }

    public Date getDateReservation() {
        return dateReservation;
    }
}
