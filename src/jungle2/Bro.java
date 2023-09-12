package jungle2;
public class Bro {
    public final int intelligenza;
    // finale vuol dire che non si puo' cambiare
    protected String nome;
    private String nonutilizzato;
    // private impedisce l'utilizzo all'esterno della class

    public static final int moltiplicatoreforzax5 = 5;
    // essendo statico lo si deve richiamare con la classe, in questo caso Bro, in quanto e' uguale per tutti gli oggetti

    public String getNome() {
        return nome;
    }
    // dato che non si puo' piu utilizzare all'esterno della class bisogna fare click destro, generate, getter
    // e anziche fare this.nome si fa this.getNome()


    public int forza;
    // imposta i parametri per l'oggetto bro
    public Bro() {
        intelligenza = 100;
        forza = 100;
        nome = "Bro";
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
    }
    // this indica l'oggetto selezionato e si puo' usare dentro alle "funzioni"




}
