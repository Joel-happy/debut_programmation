package Menu;

import TP.*;

import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {
        execution();
    }
    public static void execution() {
            Scanner scan = new Scanner(System.in);

            int choixUtilisateur;
            do {
                System.out.println("=*=* |MENU JAVA| *=*=");
                System.out.println();
                System.out.println();
                System.out.println("Quel programme desirez vous lancer? ");
                System.out.println();
                System.out.println("(1)Crypter & Decrypter");
                System.out.println();
                System.out.println("(2) Suite & arctagente");
                System.out.println();
                System.out.println("(3) Permuter");
                System.out.println();
                System.out.println();
                System.out.println("(4) Seuil");
                System.out.println();
                System.out.println();
                System.out.println("(5) EDF");
                System.out.println();
                System.out.println("(0). Quitter");

                choixUtilisateur = scan.nextInt();
                switch (choixUtilisateur) {
                    case 1:
                        System.out.println();
                        System.out.println();//pour rendre le code plus lisible
                         TestTP2_1.TestTP2_1();
                        System.out.println();
                        System.out.println();//pour rendre le code plus lisible
                        break;
                    case 2:
                        System.out.println();
                        System.out.println();//pour rendre le code plus lisible
                        TestTP2_2.TestTP2_2();
                        System.out.println();
                        System.out.println();//pour rendre le code plus lisible
                        break;
                    case 3:
                        System.out.println();
                        System.out.println();//pour rendre le code plus lisible
                         TestTP2_3.TestTP2_3();
                        System.out.println();
                        System.out.println();//pour rendre le code plus lisible
                        break;
                    case 4:
                        System.out.println();
                        System.out.println();//pour rendre le code plus lisible
                         TestTP2_4.TestTP2_4();
                        System.out.println();
                        System.out.println();//pour rendre le code plus lisible
                        break;
                     case 5:
                        System.out.println();
                        System.out.println();//pour rendre le code plus lisible
                        TestTP2_5.TestTP2_5();
                        System.out.println();
                        System.out.println();//pour rendre le code plus lisible
                        break;
                    case 0:
                        System.out.println();
                        System.out.println();
                        System.out.println("Votre demande à bien été prise en compte...");
                        System.out.println("Sortie du programme");
                        System.out.println();

                        break;
                    default:
                        System.out.println("Erreur! Veuillez sélectionner parmis les options qui vous sont proposées");
                        break;
                }
            } while (choixUtilisateur != 0);
        }
    }




