package ba.unsa.etf.rpr;
import ba.unsa.etf.rpr.sinusiFaktorijel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Unesite jedan cijeli broj: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int faktorijel = sinusiFaktorijel.faktorijel(n);
        double sinus = sinusiFaktorijel.sinus(n);
        System.out.println("Sinus unesenog broja je: "+sinus+"\nFaktorijel unesenog broja je: "+faktorijel);

    }
}