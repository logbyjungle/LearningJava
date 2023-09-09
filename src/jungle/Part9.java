package jungle;

import java.security.cert.TrustAnchor;

public class Part9 {

    public static void main(String[] args) {
        int intero = 5;
        float decimale = 1.5f;
        float mix1 = intero * decimale;
        // si può moltiplicare un intero con un decimale infatti un intero è un decimale 5 = 5.000
        System.out.println(mix1);
        int mix2 = intero * (int)decimale;
        // ma non si può fare lo stesso con i decimali, infatti bisogna convertirli in interi
        // la conversione da decimale ed intero non tiene conto dei numeri dopo la virgola
        System.out.println(mix2);

        String coso = (intero == 5) ? "numeroè5" : "numerononè5";
        // è un modo piu comodo di creare un if basico, "numeroè5" è quando è vero, "numerononè5" è quando è falso
        System.out.println(coso);

    }
}