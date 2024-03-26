package PApplication;

import PAdherents.*;
import PLivres.*;

import java.util.Date;

public class RetourLivres {
    private Adherent adherent; // Adhérent qui effectue le retour
    private Livre livre; // Livre retourné
    private Date dateRetour; // Date du retour

    public RetourLivres(Adherent adherent, Livre livre, Date dateRetour) {
        this.adherent = adherent;
        this.livre = livre;
        this.dateRetour = dateRetour;
    }

    public void effectuerRetour() throws EmpruntEnCoursException {
        if (adherent.aEmprunte(livre)) {
            adherent.retirerEmprunt(livre);
            livre.incrementerNombreExemplairesDisponibles();
            System.out.println("Le livre a été retourné avec succès.");
            if (adherent.aDemandeRenouvellement(livre)) {
                if (!livre.estReserve()) {
                    adherent.retirerDemandeRenouvellement(livre);
                    adherent.ajouterEmprunt(livre);
                    System.out.println("Le prêt a été renouvelé avec succès.");
                } else {
                    System.out.println("La demande de renouvellement a été refusée car il y a une réservation sur ce livre.");
                }
            }
        } else {
            throw new EmpruntEnCoursException("L'adhérent n'a pas d'emprunt en cours sur ce livre.");
        }
    }

    public void encaisserCaution() {
        adherent.encaisserCaution();
        System.out.println("Le chèque de caution a été encaissé.");
    }

    // Autres méthodes et fonctionnalités liées au retour des livres
}
