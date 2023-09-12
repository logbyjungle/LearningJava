package jungle3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws eccezione {
        // throws eccezione verra' elencato tra gli errori quindi non ce bisogno di scriverlo

        brightness livellodiluminosita = brightness.luminoso;
        // do a livellodiluminosita il valore luminoso dell'enum brightness
        System.out.println(livellodiluminosita);

        tool utensile;
        // definisce utensile

        utensile = tool.axe;
        System.out.println(utensile.damage);
        utensile = tool.sword;
        System.out.println(utensile.damage);
        // imposta come utensile uno dei tool e gli chiede il danno

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        // crea uno scanner e chiede per un numero

        controllo69(numero);
        // controlla se il numero dato e' 69 usando l'eccezione

        int numero2 = scanner.nextInt();
        // crea un altro scanner

        try {
            controllo69(numero2);
        } catch (Exception eccezioneavvenuta) {
            System.out.println("CATTURATA ECCEZIONE " + eccezioneavvenuta);
            // questo avviene se viene catturata
        } finally {
            System.out.print("");
            // questo sempre, per questo gli ho fatto scrivere il nulla nella stessa fila del resto del testo
        }
        // utilizza try/catch/finally per fare eseguire il controllo e dare l'errore senza fermare il codice



    }

    private static void controllo69(int numero) throws eccezione {
        // crea una funzione per controllare se il numero e' 69
        if(numero == 69) {
            throw new eccezione("OOOO IL NUMERO E' 69 CHE ROBA BRO MO VAI PURE A CAGARE");
        }
    }
}
