package jungle;

import java.security.cert.TrustAnchor;

public class Part4 {

    public static void main(String[] args) {
        int valore = 10;
        boolean coso = valore != 5;
        // coso è vero solo se valore è diverso da 5, gli operatori logici sono
        // > >= == != <= <
        System.out.println(coso);
        boolean cosone = coso == false;
        // è un modo per invertire un booleano, un modo più semplice per farlo è fare boolean cosone = !coso
        System.out.println(cosone);
    }
}