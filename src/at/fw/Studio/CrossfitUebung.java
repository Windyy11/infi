package at.fw.Studio;

public class CrossfitUebung {
    private String name;
    private String hilfsmittel;

    public CrossfitUebung(String name, String hilfsmittel) {
        this.name = name;
        this.hilfsmittel = hilfsmittel;
    }

    public CrossfitUebung() {

    }

    public String getName() {
        return name;
    }

    public String getHilfsmittel() {
        return hilfsmittel;
    }

    public static void main(String[] args) {
        // Beispiel, wie du eine Instanz von CrossfitUebung erstellen kannst
        CrossfitUebung uebung = new CrossfitUebung("Kipping Pull-Ups", "Klimmzugstange");

        // Jetzt kannst du die Instanz verwenden
        System.out.println("Übung: " + uebung.getName());
        System.out.println("Hilfsmittel: " + uebung.getHilfsmittel());
    }

    public void setName(String s) {
    }

    public void setHilfsmittel(String klimmzugstange) {
    }

    public void getInfo() {
    }
}