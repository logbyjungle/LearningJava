package jungle;

import java.security.cert.TrustAnchor;

public class Part6 {

    public static void main(String[] args) {
        int numero = 50;
        boolean numerodiversoda30;
        if (numero != 30) {
            numerodiversoda30 = true;
            System.out.println(numerodiversoda30);
        } else if (numero > 30) {
            numerodiversoda30 = true;
            System.out.println(numerodiversoda30);
            System.out.println("il numero è maggiore di 30");
        } else {
            numerodiversoda30 = false;
            System.out.println(numerodiversoda30);
        }
        // anche se il numero era maggiore di 30 dato che la prima entrata if funzionava sul fatto che 30 fosse diverso
        // da 30 è stata eseguita quella e le altre sono state ignorate, ciò significa che qualunque il valore sia
        // la seconda entrata non verrà mai utilizzata
    }
}