package PLivres;

import PAdherents.Adherent;

public class Livre implements ILivre {
    private static int compteur = 0; // Compteur pour le numéro d'exemplaire
    private int nombreExemplaire; // Numéro d'exemplaire du livre
    private String ISBN; // Identifiant unique du livre
    private String titre; // Titre du livre
    private String auteur; // Nom de l'auteur
    private int nombreExemplaires; // Nombre total d'exemplaires du livre
    private int nombreExemplairesDisponibles; // Nombre d'exemplaires disponibles du livre

    public Livre(String ISBN, String titre, String auteur, int nombreExemplaires) {
        this.nombreExemplaire = ++compteur;
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
        this.nombreExemplaires = nombreExemplaires;
        this.nombreExemplairesDisponibles = nombreExemplaires;
    }

    public int getNombreExemplaire() {
        return nombreExemplaire;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombreExemplaires() {
        return nombreExemplaires;
    }

    public int getNombreExemplairesDisponibles() {
        return nombreExemplairesDisponibles;
    }

    public void enregistrerLivre() {
        // Enregistrement du livre dans le système
        // Ajouter le livre à la liste des livres gérés
    }

    public void supprimerLivre() {
        // Suppression du livre du système
        // Retirer le livre de la liste des livres gérés
    }

    @Override
    public void enregistrerLivre(String ISBN, String titre, String auteur, int nombreExemplaires) {

    }

    @Override
    public void supprimerLivre(Livre livre) {

    }

    public boolean existeLivre(String ISBN) {
        return this.ISBN.equals(ISBN);
    }

    @Override
    public boolean possedeLivreDisponible(String ISBN) {
        return false;
    }

    @Override
    public boolean estReserve(String ISBN) {
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

    public boolean possedeLivreDisponible() {
        return nombreExemplairesDisponibles > 0;
    }

    public boolean estReserve() {
        return nombreExemplairesDisponibles < nombreExemplaires;
    }

    public boolean estEmprunte() {
        return false;
    }

    public Adherent getEmprunteur() {
        return null;
    }
}
