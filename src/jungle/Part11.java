package jungle;

public class Part11 {
    public static void main(String[] args) {
        String[] cosi = new String[1];
        cosi[0] = "coso";
        cosinumerovolteselezionatore(cosi, 5,0);
        // utilizzo del metodo cosinumerovolteselezionatore secondo i parametri necessari
    }
    public static void cosinumerovolteselezionatore(String[] cosi, int numerovolte, int selezionatore) {
        for (int volte = 0; volte != numerovolte ; volte++) {
            System.out.println(cosi[selezionatore]);
        }
        // loop che viene eseguito numerovolte volte
    }
}
