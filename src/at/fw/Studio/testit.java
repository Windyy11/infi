package at.fw.Studio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class testit {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<CrossfitUebung> mUebungenliste = new ArrayList<>();
        CrossfitUebung uebung = new CrossfitUebung();
        String[] uebungsListe = {"Kipping Pull-Ups", "Deadlifts", "Latzug", "Bankdrücken", "Rudern"};
        String[] hilfsmittelListe = {"Klimmzugstange", "Langhantel", "Stange breit", "Stange schmal", "Gewichte"};

        Fitnessstudio fitnessstudio = new Fitnessstudio("PowerFit", "Hamburg", 5);

        for (int i = 1; i <= 5; i++) {
            int ui = r.nextInt(uebungsListe.length - 1 - 0) + 0;
            int hi = r.nextInt(hilfsmittelListe.length - 1 - 0) + 0;
            mUebungenliste.add(new CrossfitUebung (uebungsListe[ui], hilfsmittelListe[hi]));
        }

        uebung.setName("Kipping Pull-Ups");
        uebung.setHilfsmittel("Klimmzugstange");

        fitnessstudio.getInfo();
        fitnessstudio.fuegeUebungHinzu(uebung);
        fitnessstudio.getUebungenImStudio();

        for (CrossfitUebung u : mUebungenliste) {
            System.out.println("Neue Übung: " + u.getName() + ", benötigte Hilfsmittel: " + u.getHilfsmittel());
            fitnessstudio.fuegeUebungHinzu(u);
        }
        fitnessstudio.getUebungenImStudio();
    }
}