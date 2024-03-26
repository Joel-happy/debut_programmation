package PApplication;

import PLivres.Livre;
import PAdherents.Adherent;

import java.util.*;

public class Emprunt {
    private Adherent emprunteur; // Adhérent qui effectue l'emprunt
    private Livre livre; // Livre emprunté
    private Date dateEmprunt; // Date de l'emprunt

    public Emprunt(Adherent emprunteur, Livre livre, Date dateEmprunt) {
        this.emprunteur = emprunteur;
        this.livre = livre;
        this.dateEmprunt = dateEmprunt;
    }

    public Adherent getEmprunteur() {
        return emprunteur;
    }

    public Livre getLivre() {
        return livre;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public boolean estEmpruntable() {
        return livre.possedeLivreDisponible() && !livre.estReserve();
    }

    public boolean estEmpruntPossible() {
        return emprunteur.getNombreEmpruntsEnCours() < 5;
    }

    public void effectuerEmprunt() {
        if (estEmpruntable() && estEmpruntPossible()) {
            // Effectuer l'emprunt du livre en mettant à jour les informations dans le système
            emprunteur.incrementerNombreEmpruntsEnCours();
            livre.setEmprunte(true);
            livre.setEmprunteur(emprunteur);
            // Noter le nom de l'emprunteur, la date de prêt et le numéro de livre ISBN dans le système
        } else {
            System.out.println("L'emprunt n'est pas possible.");
            if (!livre.possedeLivreDisponible()) {
                System.out.println("Le livre n'est pas disponible.");
            }
            if (livre.estReserve()) {
                System.out.println("Le livre est réservé.");
            }
            if (emprunteur.getNombreEmpruntsEnCours() >= 5) {
                System.out.println("L'adhérent a atteint la limite d'emprunts en cours.");
            }
        }
    }

    public void annulerEmprunt() {
        if (livre.estEmprunte() && livre.getEmprunteur() == emprunteur) {
            // Annuler l'emprunt du livre et mettre à jour les informations dans le système
            emprunteur.decrementerNombreEmpruntsEnCours();
            livre.setEmprunte(false);
            livre.setEmprunteur(null);
            // Retirer le livre des emprunts en cours de l'adhérent
        } else {
            System.out.println("L'emprunt ne peut pas être annulé.");
            if (!livre.estEmprunte()) {
                System.out.println("Le livre n'est pas emprunté par cet adhérent.");
            }
        }
    }

    public boolean estReservationProposee() {
        return !livre.possedeLivreDisponible() || livre.estReserve();
    }
}
