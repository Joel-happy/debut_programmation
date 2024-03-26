package TP;
import java.util.Scanner;

public class TestTP2_2 {
    static Scanner lecture = new Scanner(System.in);
    double premier_terme;
    int terme;
    public static void main(String[] args) {
        System.out.println("Entrez la valeur du premier terme");
        double premier_terme=lecture.nextDouble();
        System.out.println("Entrez le terme que vous souhaitez calculer");
        int terme=lecture.nextInt();
        System.out.println(Suite(premier_terme,terme));
        TestTP2_2();
    }

   protected static double MyPow(double nombre,int exposant){
        System.out.print(Math.pow(nombre,exposant));
        return Math.pow(nombre,exposant);
    }

    protected static double Suite(double x, int n) {
        double u = x; // on initialise U0
        for (int i = 1; i <= n; i++) {
            u = u + MyPow(-1, i) * MyPow(x, 2*i+1) / (2*i+1); // on calcul de Un
        }
        return u; // pour retourner la dernière valeur calculée de la suite
    }

    public static void TestTP2_2() {
        double x = 0.5;
        int n = 100;

        // on calcule la valeur de la suite pour x et n donnés
        double suite = Suite(x, n);

        // on calcule la valeur de atan(x)
        double atan = Math.atan(x);

        // Affichage des résultats
        System.out.println("Valeur de la suite : " + suite);
        System.out.println("Valeur de atan(x) : " + atan);

        // Comparaison avec la fonction atan pour n > 50
        if (n > 50) {
            double difference = Math.abs(atan - suite);
            System.out.println("Différence entre la suite et atan(x) : " + difference);
        }
    }

}

