package jungle;

import java.security.cert.TrustAnchor;

public class Part10 {

    public static void main(String[] args) {

        String[] cosi = new String[3];
        // 3 è quanti elementi contiene
        cosi[0] = "coso bello";
        cosi[1] = "coso brutto";
        cosi[2] = "coso indecente";
        System.out.println(cosi[0]);

        // crea la variante numero, dopodiche esegue il codice in parentesi graffe, dopo averlo eseguito incomincia il vero loop
        // ovvero controlla se numero è diverso dalla dimensione dell'array cosi, e se lo è esegue numero++, poi esegue il codice
        // in graffe e ripete il loop fino a quando numero non è uguale alla dimensione di cosi
        for(int numero = 0; numero != cosi.length; numero++) {
            System.out.println(numero);
        }

        // in tipo di loop è un "per ogni"
        for(String coso: cosi) {
            System.out.println(coso);
        }

        // questo tipo di loop è un "mentre"
        int numero = 0;
        int numeraccio = 3;
        while(numero < numeraccio) {
            if(numero != (numeraccio - 1)) {
                System.out.println(numero);
                numero++;
            } else {
                System.out.println(numero);
                numero++;
                System.out.println(numero);
            }
        }
        // in questo tipo di loop mentre si può usare continue; e break;
    }
}