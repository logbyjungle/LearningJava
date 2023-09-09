package jungle;

import java.security.cert.TrustAnchor;

public class Part3 {

    public static void main(String[] args) {
        int numero0;
        int numero1;
        numero0 = 10;
        numero1 = 5;
        numero0 += numero1;
        // numero0 += numero1 è come fare numero0 = numero0 + numero1
        // oltre a += c'è anche -= , *= , /= , %=
        System.out.println(numero0);
        numero0++;
        // aumenta numero0 di uno, si può fare anche --
        System.out.println(numero0);
    }
}