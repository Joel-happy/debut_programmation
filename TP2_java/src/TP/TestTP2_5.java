package TP;

public class TestTP2_5 {

    public static void main(String[] args) {

    }

    public static void TestTP2_5() {
        int[] anciensIndex = {0, 100, 250, 0}; // Index de départ
        int[] nouveauxIndex = {0, 200, 450, 1000}; // Index d'arrivée

        double totalFacture = 0.0;
        for (int i = 0; i < 4; i++) {
            int nbKWH = ConsommationKWH(nouveauxIndex[i], anciensIndex[i]);
            double prixHorsTaxe = PayeKWH(nbKWH,0);
            double prixTTC = PayeKWH(nbKWH, 8.0);
            System.out.printf("Consommation : %d KWh\n", nbKWH);
            System.out.printf("Prix hors taxe : %.2f €\n", prixHorsTaxe);
            System.out.printf("Prix toutes taxes comprises : %.2f €\n", prixTTC);
            totalFacture += prixTTC;
        }
        System.out.printf("Total facture : %.2f €\n", totalFacture + 200.0);
    }



    public static double PayeKWH(int nbKWH, double tva) {
        double prixHT = 0;
        if (nbKWH > 0 && nbKWH <= 100) {
            prixHT = nbKWH * 0.1;
        } else if (nbKWH > 100 && nbKWH <= 250) {
            prixHT = 100 * 0.1 + (nbKWH - 100) * 0.175;
        } else if (nbKWH > 250) {
            prixHT = 100 * 0.1 + 150 * 0.175 + (nbKWH - 250) * 0.225;
        } else {
            System.out.println("Vous avez sûrement entré une mauvaise valeur");
        }
        double montantTTC = prixHT * (1 + tva / 100);
        return montantTTC;
    }

    public static int ConsommationKWH(int nouveau, int ancien) {
        int consommation = nouveau - ancien;
        if (consommation < 0) {
            System.out.println("Erreur : l'index du nouveau relevé est inférieur à celui de l'ancien relevé.");
            return -1;
        } else {
            return consommation;
        }
    }

}

