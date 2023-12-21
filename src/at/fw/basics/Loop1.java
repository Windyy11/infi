package at.fw.basics;

public class Loop1 {
    public static void main(String[] args) {
        int summe = 0; // Initialisiere die Summe mit 0

        for (int zahl = 1; zahl <= 100; zahl++) {
            summe += zahl; // Addiere die aktuelle Zahl zur Summe
        }

        System.out.println("Die Summe der Zahlen von 1 bis 100 beträgt: " + summe);
    }
}

