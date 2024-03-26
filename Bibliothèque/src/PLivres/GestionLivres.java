package PLivres;

import PAdherents.Adherent;

import java.util.ArrayList;
import java.util.List;

public class GestionLivres implements ILivre {
    private List<Livre> livres;

    public GestionLivres() {
        livres = new ArrayList<>();
    }

    @Override
    public void enregistrerLivre(String ISBN, String titre, String auteur, int nombreExemplaires) {
        Livre livre = new Livre(ISBN, titre, auteur, nombreExemplaires);
        livres.add(livre);
        System.out.println("Le livre a été enregistré avec succès.");
    }

    @Override
    public void supprimerLivre(Livre livre) {
        livres.remove(livre);
        System.out.println("Le livre a été supprimé avec succès.");
    }

    @Override
    public boolean existeLivre(String ISBN) {
        for (Livre livre : livres) {
            if (livre.getISBN().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean possedeLivreDisponible(String ISBN) {
        for (Livre livre : livres) {
            if (livre.getISBN().equals(ISBN) && livre.getNombreExemplairesDisponibles() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean estReserve(String ISBN) {
        for (Livre livre : livres) {
            if (livre.getISBN().equals(ISBN) && livre.estReserve()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setEmprunteur(Adherent emprunteur) {

    }

    @Override
    public void setEmprunte(boolean b) {

    }

    @Override
    public void incrementerNombreExemplairesDisponibles() {

    }

    // Autres méthodes de gestion des livres si nécessaire
}
