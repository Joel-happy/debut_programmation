package PClasse;
import PEtudiant.Etudiant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Classe {
    public List<Etudiant> listeEtudiants;

    public Classe() {
        listeEtudiants = new ArrayList<Etudiant>();
    }

    public void afficher() {
        // code pour afficher les informations de la classe
    }

    public Etudiant getEtudiant(String nom) {
        // code pour récupérer un étudiant en fonction de son nom
        return null;
    }

    public float moyenneClasse(String matiere) {
        // code pour calculer la moyenne de la classe pour une matière donnée
        return 0;
    }

    public void setEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
    }

    public void sauvegarder(String nomFichier) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nomFichier));
            for (Etudiant etudiant : listeEtudiants) {
                writer.write(etudiant.getNom() + "," + etudiant.getPrenom() + "," + etudiant.getNote() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde de la liste des étudiants.");
        }
    }

    public void lire(String nomFichier) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nomFichier));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String nom = data[0];
                String prenom = data[1];
                String matricule = data[2];
                Etudiant etudiant = new Etudiant(nom, prenom, matricule);
                listeEtudiants.add(etudiant);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture de la liste des étudiants.");
        }
    }
}