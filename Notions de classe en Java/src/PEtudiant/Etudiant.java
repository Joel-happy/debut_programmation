package PEtudiant;

public class Etudiant {
    public String nom;
    public String prenom;
    public String matricule;
    public double note;

    //constructeur
    public Etudiant(String nom, String prenom, String matricule){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        System.out.println("étudiant créé au nom de"+"\n"+nom+".\n"+ "ayant pour prénom :"+"\n" +prenom+".\n"+ "et matricule :"+ "\n"+matricule );
    }

    //méthodes
    public void afficherNote() {
        //code pour afficher les notes de l'étudiant
    }

    public void afficherNote(String matiere) {
        //code pour afficher les notes de l'étudiant dans une matière spécifique
    }

    public int moyenne(String matiere) {
        //code pour calculer la moyenne de l'étudiant dans une matière spécifique
       return 0; // doit return un  int  notamment la moyenne de l'etudiant
    }

    public void setNote(String matiere, String date, double note) {
        //code pour ajouter une note à l'étudiant

    }

    public void setNote(String matiere, String date, int coef, double note) {
        //code pour ajouter une note pondérée à l'étudiant
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) { //pour récuperer le nom
        this.nom = nom;
    }

    public String getPrenom() { //pour recuperer le prénom
        return prenom;
    }

    public String getNote() { //pour récuperer la note
        return (String.valueOf(note));
    }
}

/*La classe Etudiant est représentée dans un modèle UML.

PEtudiant pourrait être le nom d'un package qui contient la classe Etudiant.

La classe Etudiant a plusieurs méthodes publiques:

setNote(String, String, double) : Cette méthode prend trois paramètres, deux de type String qui représentent l'identifiant de l'étudiant et l'identifiant du cours, et un de type double qui représente la note. Elle est utilisée pour ajouter une nouvelle note à la liste des notes d'un étudiant pour un cours spécifique.

setNote(String, String, int, double) : Cette méthode prend quatre paramètres, deux de type String qui représentent l'identifiant de l'étudiant et l'identifiant du cours, un entier qui représente l'indice de la note et un double qui représente la valeur de la note. Elle est utilisée pour mettre à jour la valeur d'une note existante pour un étudiant et un cours spécifiques.*/