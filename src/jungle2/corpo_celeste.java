package jungle2;

public abstract class corpo_celeste {
    // essere astratta vuol dire che non posso creare nessun oggetto del tipo corpo celeste, ma posso usare corpo celeste
    // come classe di origine per altri oggetti
    protected String identificatore;
    public corpo_celeste() {
        identificatore = "corpo celeste";
    }

    public corpo_celeste(String identificatore) {
        this.identificatore = identificatore;
    }
}
