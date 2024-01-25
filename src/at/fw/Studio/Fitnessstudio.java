package at.fw.Studio;

import java.util.ArrayList;
import java.util.Random;
public class Fitnessstudio {

        private String name;
        private String standort;
        private int maxUebungenImStudio;
        private ArrayList<CrossfitUebung> crossfitUebungen;

        public Fitnessstudio(String name, String standort, int maxUebungenImStudio) {
            this.name = name;
            this.standort = standort;
            this.maxUebungenImStudio = maxUebungenImStudio;
            this.crossfitUebungen = new ArrayList<>();
        }

        public void fuegeUebungHinzu(CrossfitUebung uebung) {
            if (crossfitUebungen.size() >= this.maxUebungenImStudio) {
                System.out.println("Das Fitnessstudio hat " + this.maxUebungenImStudio + " Übungen!");
            }
            crossfitUebungen.add(uebung);
        }

        public String getName() {
            return name;
        }

        public String getStandort() {
            return standort;
        }

        public ArrayList<CrossfitUebung> getCrossfitUebungen() {
            return crossfitUebungen;
        }

        public void getInfo() {
            System.out.println("Fitnessstudio: " + this.name + " in " + this.standort);
        }

        public void getUebungenImStudio() {
            for (CrossfitUebung uebung : crossfitUebungen) {
                uebung.getInfo();
            }
        }
    }