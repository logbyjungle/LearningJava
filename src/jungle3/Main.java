package jungle3;

public class Main {
    public static void main (String[] args) {
        brightness livellodiluminosita = brightness.luminoso;
        // do a livellodiluminosita il valore luminoso dell'enum brightness
        System.out.println(livellodiluminosita);

        tool utensile;
        // definisce utensile

        utensile = tool.axe;
        System.out.println(utensile.damage);
        utensile = tool.sword;
        System.out.println(utensile.damage);

    }
}
