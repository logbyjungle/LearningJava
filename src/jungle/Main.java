package jungle;

import java.security.cert.TrustAnchor;
import java.util.Scanner;
// è dovuto dall'utilizzo di Scanner

public class Main {

    public static void main(String[] args) {
        // tipi di numeri
        int numero0 = 30;
        // int = integer,numero intero, numero0=variabile , 30= valore , ; = finire la riga
        float numero1 = 15.249f;
        // float = numero decimale , f è necessario , i float hanno 7 cifre dopo la virgola di precisione
        double numero2 = 92.23888223f;
        double numero3 = 92.23888223d;
        double numero4 = 92.23888223;
        // double = numero decimale con 15 cifre di precisione dopo la virgola, si può usare sia f che d che nulla
        byte numero5 = 100;
        // contiene numeri da -128 a 127
        short numero6 = 30000;
        // contiene numeri da -32768 a 32767
        boolean possibilità0 = true;
        boolean possibilità1 = false;
        // booleano ovvero vero o falso
        char carattere0 = 'j';
        // contiene un singolo carattere
        String frase0 = "questa frase non esiste";
        String frase1 = null;
        // contiene una stringa di testo oppure niente
        int numero7;
        // crea un variabile che può contenere un numero intero
        numero7 = 69;
        // da un valore ad una variabile
        frase0.length();
        // utilizza la funzione lenght() della stringa frase0
        System.out.println("testo a caso");
        System.out.print(numero0);
        System.out.println(numero1 + "si chiama abdul");
        // crea un output, print, anziche println, non va a capo
        Scanner scanner = new Scanner(System.in);
        // crea uno scanner
        String input0 = scanner.nextLine();
        // crea un input
        // nel caso in cui l'input sono stringhe è consigliato usare scanner.next() anziche scanner.nextline()
        System.out.println("hai detto: " + input0);
        // output basico
        scanner.close();
        // chiude lo scanner !!!NECESSARIO ALLA FINE DEL CODICE!!!
    }
}