package jungle2;
public class Bro {
    public int intelligenza;
    public String nome;
    public int forza;
    // imposta i parametri per l'oggetto bro
    public Bro() {
        intelligenza = 100;
        forza = 100;
        nome = "IlBro";
    }
    // da dei parametri di default all'oggetto bro


    public Bro(int intelligenza, String nome, int forza) {
        this.intelligenza = intelligenza;
        this.nome = nome;
        this.forza = forza;
    }
    // genera un costruttore, utile per creare un oggetto con , in questo caso, Bro goku = new Bro(10, goku, 1000)
    // anziche scrivere il codice per questo basta fare click destro, generate, constructor e definire le impostazioni

    public void Died() {
        System.out.println(this.nome + " e' morto");
        this.forza = 0;
        this.intelligenza = 0;
    }
    // this indica l'oggetto selezionato e si puo' usare dentro alle "funzioni"


}
