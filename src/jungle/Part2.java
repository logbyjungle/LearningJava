package jungle;

import java.security.cert.TrustAnchor;

public class Part2 {

    public static void main(String[] args) {
        int numero0 = 1;
        int numero1 = 2;
        int numero2;
        // definisce la variabile numero2
        numero2 = numero0 + numero1;
        // addizione
        System.out.println(numero2);
        // 1 + 2 = 3
        int numero3;
        // definisce la variabile numero3
        numero3 = numero2 - numero0;
        // sottrazione
        System.out.println(numero3);
        // 3 - 1 = 2
        numero3 = numero2 * numero2;
        // moltiplicazione
        System.out.println(numero3);
        // 3 * 3 = 9
        numero3 = numero2 / numero2;
        // divisione
        System.out.println(numero3);
        // 3 / 3 = 1
        numero3 = 10 % 2;
        // resto
        System.out.println(numero3);
        // 10 : 2 = 5 senza resto = 0
        System.out.println(Math.abs(-1));
        // funzioni di matematica, in questo caso Math.abs è per il valore assoluto
    }
}