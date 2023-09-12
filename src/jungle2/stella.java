package jungle2;

public class stella extends corpo_celeste implements IoGrosso{
    public stella() {
        identificatore = "stella";
    }
    public stella(String identificatore) {
        super(identificatore);
    }

    @Override
    public void grosso() {
        System.out.println(this.identificatore + " e' grosso");
    }
    // implementa il metodo IoGrosso

}
