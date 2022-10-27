package ba.unsa.etf.rpr;
import ba.unsa.etf.rpr.sinusiFaktorijel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Unesite jedan cijeli broj: ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int faktorijel = sinusiFaktorijel.faktorijel(n);
            double sinus = sinusiFaktorijel.sinus(n);
            System.out.println("Sinus unesenog broja je: " + sinus + "\nFaktorijel unesenog broja je: " + faktorijel);
        } else if(args[0].equalsIgnoreCase("Sinus")) {
            double sinus = sinusiFaktorijel.sinus(Double.parseDouble(args[1]));
            System.out.println("Sinus datog broja je: "+sinus);
        } else if(args[0].equalsIgnoreCase("Faktorijel")) {
            int faktorijel = sinusiFaktorijel.faktorijel(Integer.parseInt(args[1]));
            System.out.println("Faktorijel datog broja je: "+faktorijel);
        }

    }
}