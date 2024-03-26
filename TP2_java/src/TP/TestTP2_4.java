package TP;

import java.util.Scanner;

public class TestTP2_4 {
    static Scanner lecture = new Scanner(System.in);

    public static void main(String[] args) {

    }

   public static void TestTP2_4(){
       double prix, taux;
       System.out.println("Entrez le prix de l'article :");
       prix = lecture.nextDouble();
       System.out.println("Entrez le taux d'inflation par mois :");
       taux = lecture.nextDouble();
       testSeuil(prix, taux);
   }
    public static void testSeuil(double prix, double taux) {
        int[] tableauN = new int[10];
        int n = 0;
        while (prix < 1000 && n < tableauN.length) {
            prix = prix * taux;
            tableauN[n] = n + 1;
            n++;
        }
        System.out.println("Tableau des résultats : ");
        System.out.println("Prix initial : " + prix);
        System.out.println("Taux d'inflation : " + taux);
        System.out.println("Nombre de mois pour atteindre 1000 : ");
        for (int i = 0; i < n; i++) {
            System.out.print(tableauN[i] + "\n");
        }
        System.out.println();
    }
}
