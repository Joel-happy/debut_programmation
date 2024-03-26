package TP;
import java.util.Scanner;

public class TestTP2_3 {
    static Scanner lecture = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void permuter(double[] tab, int a, int b) {
        double temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }

    public static void TestTP2_3(){System.out.print("Entrez le nombre d'éléments du tableau: ");
        int n = lecture.nextInt();

        double[] tab = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'élément numéro " + i + ": ");
            tab[i] = lecture.nextDouble();
        }

        System.out.println("Tableau avant permutation:");
        afficher(tab);

        permuter_Tableau(tab);
        System.out.println("Tableau après permutation:");
        afficher(tab);

    }
    public static void permuter_Tableau(double[] tab) {
        int n = tab.length;
        for (int i = 0; i < n / 2; i++) {
            double temp = tab[i];
            tab[i] = tab[n - i - 1];
            tab[n - i - 1] = temp;
        }
    }

    public static void afficher(double[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab [" + i + "]" + "=" + tableau[i] + " ");
        }
    }
}

