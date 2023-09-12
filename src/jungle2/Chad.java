package jungle2;

public class Chad extends Bro{

    public Chad() {
        forza = 999;
        nome = "Chad";
    }

    public Chad(int intelligenza, String nome, int forza) {
        super(intelligenza, nome, forza);
    }

    public void Jumped() {
        System.out.println(this.nome + " ha saltato");
    }
    @Override
    public void Died() {
        System.out.println(this.nome + " e' invincibile");
    }

}
