package jungle;

import java.security.cert.TrustAnchor;

public class Part8 {

    public static void main(String[] args) {
        String stringa = "I Gatti Sono Particolarmente Belli";
        System.out.println(stringa);
        System.out.println(stringa.toLowerCase());
        System.out.println(stringa.toUpperCase());
        System.out.println(stringa.replace("Belli", "Simpatici"));
        boolean vuoto = stringa.isEmpty();
        System.out.println(vuoto);
        System.out.println(stringa.startsWith("J"));
        // non servono i booleani per questa cosa, vero o falso è automatico
        System.out.println(stringa.contains("Gatti"));
        System.out.println(stringa.charAt(0));
        // da il carattere a indice indicato

    }
}