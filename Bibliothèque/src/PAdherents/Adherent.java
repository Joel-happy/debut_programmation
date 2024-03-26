package PAdherents;

import PLivres.Livre;
import PApplication.Emprunt;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Adherent implements IAdherent {
    private int numeroAdherent;
    private String nom;
    private String prenom;
    private Adresse adresse;
    private Coordonnees coordonnees;
    private Date dateInscription;
    private int nombreLivresEmpruntes;
    private Cheque caution;
    private List<Emprunt> empruntsEnCours;

    @Override
    public void inscription(int numeroAdherent, String nom, String prenom, Adresse adresse, Coordonnees coordonnees, Cheque caution) {
        this.numeroAdherent = numeroAdherent;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.coordonnees = coordonnees;
        this.dateInscription = new Date(); // Date d'inscription actuelle
        this.nombreLivresEmpruntes = 0; // Initialiser à 0
        this.caution = caution;
        this.empruntsEnCours = new ArrayList<>();
    }

    @Override
    public void afficherInfos() {
        System.out.println("Informations de l'adhérent :");
        System.out.println("Numéro d'adhérent : " + numeroAdherent);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Adresse : " + adresse.getCodePostal() + " " + adresse.getVille() + ", " + adresse.getRue());
        System.out.println("Coordonnées : " + coordonnees.getNumeroDeTelephone() + ", " + coordonnees.getEmail());
        System.out.println("Date d'inscription : " + dateInscription);
        System.out.println("Nombre de livres empruntés : " + nombreLivresEmpruntes);
        System.out.println("Caution : " + caution.getMontant());
    }

    @Override
    public void mettreAJour(String nom, String prenom, Adresse adresse, Coordonnees coordonnees, Cheque caution) {
        if (nom != null) {
            this.nom = nom;
        }
        if (prenom != null) {
            this.prenom = prenom;
        }
        if (adresse != null) {
            this.adresse = adresse;
        }
        if (coordonnees != null) {
            this.coordonnees = coordonnees;
        }
        if (caution.getMontant() > 0) {
            this.caution.setMontant(caution.getMontant());
        }
        System.out.println("Les informations de l'adhérent ont été mises à jour.");
    }

    @Override
    public void annuler() throws EmpruntEnCoursException {
        if (empruntsEnCours.isEmpty()) {
            this.numeroAdherent = 0;
            this.nom = null;
            this.prenom = null;
            this.adresse = null;
            this.coordonnees = null;
            this.dateInscription = null;
            this.nombreLivresEmpruntes = 0;
            this.caution = null;
            System.out.println("L'adhérent a été annulé avec succès.");
        } else {
            throw new EmpruntEnCoursException("Impossible d'annuler l'adhérent. Des livres sont encore empruntés.");
        }
    }

    public int getNombreEmpruntsEnCours() {
        return empruntsEnCours.size();
    }

    @Override
    public boolean aEmprunte(Livre livre) {
        // Logique pour vérifier si l'adhérent a emprunté le livre spécifié
        // Retourner true si l'adhérent a emprunté le livre, sinon false
        return empruntsEnCours.stream()
                .anyMatch(emprunt -> emprunt.getLivre().equals(livre));
    }

    @Override
    public void incrementerNombreEmpruntsEnCours() {

    }

    @Override
    public void decrementerNombreEmpruntsEnCours() {

    }

    @Override
    public void retirerEmprunt(Livre livre) {

    }

    @Override
    public boolean aDemandeRenouvellement(Livre livre) {
        return false;
    }

    @Override
    public void retirerDemandeRenouvellement(Livre livre) {

    }

    @Override
    public void ajouterEmprunt(Livre livre) {

    }

    @Override
    public void encaisserCaution() {

    }

    public boolean aEmprunteLivre(Livre livre) {
        for (Emprunt emprunt : empruntsEnCours) {
            if (emprunt.getLivre().equals(livre)) {
                return true;
            }
        }
        return false;
    }

    // Méthode pour ajouter un nouvel emprunt en cours
    public void ajouterEmpruntEnCours(Emprunt emprunt) {
        empruntsEnCours.add(emprunt);
    }

    // Méthode pour supprimer un emprunt en cours
    public void supprimerEmpruntEnCours(Emprunt emprunt) {
        empruntsEnCours.remove(emprunt);
    }

    // Autres méthodes de la classe Adherent si nécessaires
}
