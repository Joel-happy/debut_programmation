package PAdherents;
import PLivres.*;

public interface IAdherent {

    void afficherInfos(); // Affiche les informations d'un adhérent

    void inscription(int numeroAdherent, String nom, String prenom, Adresse adresse, Coordonnees coordonnees, Cheque caution); // Pour créer un nouvel adhérent

    void mettreAJour(String nom, String prenom, Adresse adresse, Coordonnees coordonnees, Cheque caution); // Pour mettre à jour les informations d'un adhérent

    void annuler() throws EmpruntEnCoursException; // Pour supprimer un adhérent

    boolean aEmprunte(Livre livre); // Vérifie si l'adhérent a emprunté le livre spécifié

    void incrementerNombreEmpruntsEnCours(); // Incrémente le nombre d'emprunts en cours de l'adhérent

    void decrementerNombreEmpruntsEnCours(); // Décrémente le nombre d'emprunts en cours de l'adhérent

    void retirerEmprunt(Livre livre); // Retire un emprunt de l'adhérent pour le livre spécifié

    boolean aDemandeRenouvellement(Livre livre); // Vérifie si l'adhérent a demandé un renouvellement pour le livre spécifié

    void retirerDemandeRenouvellement(Livre livre); // Retire la demande de renouvellement de l'adhérent pour le livre spécifié

    void ajouterEmprunt(Livre livre); // Ajoute un nouvel emprunt à l'adhérent pour le livre spécifié

    void encaisserCaution(); // Encaisse la caution de l'adhérent

    // Autres méthodes communes aux adhérents

}
