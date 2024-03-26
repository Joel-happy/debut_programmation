package PLivres;

import PAdherents.Adherent;

public interface ILivre {
        void enregistrerLivre(String ISBN, String titre, String auteur, int nombreExemplaires);
        void supprimerLivre(Livre livre);
        boolean existeLivre(String ISBN);
        boolean possedeLivreDisponible(String ISBN);
        boolean estReserve(String ISBN);

    void setEmprunteur(Adherent emprunteur);

    void setEmprunte(boolean b);

    void incrementerNombreExemplairesDisponibles();
    // Autres méthodes de gestion des livres si nécessaire
    }

