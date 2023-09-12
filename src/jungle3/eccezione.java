package jungle3;

public class eccezione extends Exception{
    protected eccezione() {
        super();
    }
    //crea il costruttore per l'eccezione
    protected eccezione(String testo) {
        super(testo);
    }
    // fa in modo da potere dare un errore

}
