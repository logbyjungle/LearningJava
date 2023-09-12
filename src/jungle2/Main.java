package jungle2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // anziche con la creazione di funzioni, che servivano a fare eseguire cose, le classi servono per la creazione
        // di oggetti

        Bro abdul = new Bro();
        // crea un Bro
        System.out.println(abdul.forza);
        // l'oggetto abdul e' un Bro e puo' possodere il parametro intelligenza che in questo caso ha il valore di
        // default di 100 come impostato nella classe Bro, se non veniva impostato aveva il valore null
        abdul.forza = 104;
        System.out.println(abdul.forza);

        Bro goku = new Bro(10, "goku", 1000);
        // crea un oggetto goku utilizzando il constructor creato nella classe Bro
        System.out.println(goku.forza);

        System.out.println(goku.forza * Bro.moltiplicatoreforzax5);

        goku.Died();
        // si puo' dare funzioni agli oggetti
        System.out.println(goku.forza);
        System.out.println(goku.getNome());

        Chad Chad = new Chad();

        System.out.println(Chad.forza);

        Chad.Jumped();

        Chad.Died();

        stella sole = new stella();
        System.out.println(sole.identificatore);

        List<IoGrosso> grossi = new ArrayList<>();
        grossi.add(sole);
        // posso quindi creare una lista di tutti quelli a cui appartengono all'oggetto a cui ho attribuito l'interfaccia
        // stella, posso dare la stessa interfaccia a piu classi
        for (IoGrosso grosso : grossi) {
            grosso.grosso();
        }
        // e posso usare la funzione grosso che ho precedentemente definito




    }
}
