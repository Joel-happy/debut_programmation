package PApplication;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        afficherMenuPrincipal();
    }

    public static void afficherMenuPrincipal() {
        System.out.println("----- MENU PRINCIPAL -----");
        System.out.println("1. Gestion des adhérents");
        System.out.println("2. Gestion des livres");
        System.out.println("0. Quitter");
        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Vider la ligne après la saisie du nombre

        switch (choix) {
            case 1:
                afficherMenuAdherents();
                break;
            case 2:
                afficherMenuLivres();
                break;
            case 0:
                System.out.println("Au revoir !");
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
                afficherMenuPrincipal();
                break;
        }
    }

    public static void afficherMenuAdherents() {
        System.out.println("----- MENU ADHÉRENTS -----");
        System.out.println("1. Créer un nouvel adhérent");
        System.out.println("2. Supprimer un adhérent");
        System.out.println("3. Mettre à jour les informations d'un adhérent");
        System.out.println("4. Emprunter un livre");
        System.out.println("5. Retourner un livre");
        System.out.println("0. Retour");
        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Vider la ligne après la saisie du nombre

        switch (choix) {
            case 1:
                // Appeler la méthode pour créer un nouvel adhérent
                break;
            case 2:
                // Appeler la méthode pour supprimer un adhérent
                break;
            case 3:
                // Appeler la méthode pour mettre à jour les informations d'un adhérent
                break;
            case 4:
                // Appeler la méthode pour emprunter un livre
                break;
            case 5:
                // Appeler la méthode pour retourner un livre
                break;
            case 0:
                afficherMenuPrincipal();
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
                afficherMenuAdherents();
                break;
        }
    }

    public static void afficherMenuLivres() {
        System.out.println("----- MENU LIVRES -----");
        System.out.println("1. Ajouter un nouveau livre");
        System.out.println("2. Supprimer un livre");
        System.out.println("3. Mettre à jour les informations d'un livre");
        System.out.println("0. Retour");
        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();
        scanner.nextLine(); // Vider la ligne après la saisie du nombre

        switch (choix) {
            case 1:
                // Appeler la méthode pour ajouter un nouveau livre
                break;
            case 2:
                // Appeler la méthode pour supprimer un livre
                break;
            case 3:
                // Appeler la méthode pour mettre à jour les informations d'un livre
                break;
            case 0:
                afficherMenuPrincipal();
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
        }
    }
}
