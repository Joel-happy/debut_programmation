package TP;

public class TestTP2_1
{

public static void main(String[] args) {
    TestTP2_1();
    }

    public static void TestTP2_1() {
        String cible = "HELLO WORLD";
        String key = "ROMAIN";
        String crypted = CrypterRomain(cible, key);
        String decrypted = DeCrypterRomain(crypted, key);
        System.out.println("Message initial : " + cible);
        System.out.println("Message crypté : " + crypted);
        System.out.println("Message décrypté : " + decrypted);
    }

    public static String CrypterRomain(String cible, String key) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cible.length(); i++) {
            int c = cible.charAt(i) + key.charAt(i % key.length());
            sb.append((char) c);
        }
        return sb.toString();
    }

    public static String DeCrypterRomain(String cible, String key) {
        int n = cible.length();
        char[] decrypted = new char[n];
        for (int i = 0; i < n; i++) {
            decrypted[i] = (char)(cible.charAt(i) - key.charAt(i));
        }
        return new String(decrypted);
    }


}
