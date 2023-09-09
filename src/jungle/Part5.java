package jungle;

import java.security.cert.TrustAnchor;

public class Part5 {

    public static void main(String[] args) {
        boolean vero = true;
        boolean falso = false;
        boolean and = vero && falso;
        // && è un AND operatore logico, in questo è caso è falso perchè uno dei 2 è falso
        System.out.println(and);
        boolean or = vero || falso;
        // || è un operatore logico, in questo caso è vero perchè uno dei 2 è vero
        System.out.println(or);
        boolean opposite = !vero;
        // ! è un operatore logico gia mostrato precedentemente, prende come valore l'opposto di un altro
        boolean ovviamentevero = vero && !falso;
        // gli operatori logici possono venire usati insieme
        System.out.println(ovviamentevero);
        boolean casino = !(vero && falso) && and;
        // se non si vuole aggiungere inutili operatori logici basta mettere parentesi
    }
}