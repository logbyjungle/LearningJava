package jungle;

import java.util.*;

public class Part12 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        // crea una lista
        lista.add("coso0");
        lista.add("coso1");
        lista.add("coso2");
        //aggiunge elementi alla lista
        lista.remove(2);
        lista.remove("coso1");
        // rimuove elementi alla lista
        System.out.println(lista.get(0));
        // elemento singolo della lista
        List<Integer> listadinumeri = new ArrayList<>();
        // in String non si notava ma anziche scrivere int o robe del genere bisogna scrivere la forma completa
        // in questo caso è Integer
        listadinumeri.add(2);
        System.out.println(listadinumeri.get(0));

        Map<String,String> pulsanteamovimento = new HashMap<>();
        pulsanteamovimento.put("W","avanti");
        // creata hashmap con chiave W e valore avanti
        pulsanteamovimento.put("A","sinistra");
        pulsanteamovimento.put("S","indietro");
        pulsanteamovimento.put("D","destra");
        System.out.println(pulsanteamovimento.get("A"));
        // da il valore corrispondente alla chiave
        System.out.println(pulsanteamovimento.containsKey("S"));
        // dice se contiene una chiave S
        System.out.println(pulsanteamovimento.containsValue("indietro"));
        // dice se contiene un valore indietro
        pulsanteamovimento.remove("D");
        // rimuove una chiave dell'hashmap e il valore corrispondente

        Set<String> setbello = new HashSet<>();
        System.out.println(setbello.add("peperone"));
        System.out.println(setbello.add("peperone"));
        // dato che un set non puo contenere duplicati l'aggiunta e' falsa

    }
}
