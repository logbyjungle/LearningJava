package jungle;

import java.security.cert.TrustAnchor;

public class Part7 {

    public static void main(String[] args) {
        int coso = 2;

        // crea uno switch
        switch (coso) {
            case 2: System.out.println("coso è 2"); break;
            // break è necessario
            case 4: System.out.println("coso è 4"); break;
            case 8: System.out.println("coso è 8"); break;
            default: System.out.println("coso non è ne 2, ne 4, ne 8"); break;
            // imposta l'output di default nel caso le altre opzioni non siano abbastanza
        }
    }
}